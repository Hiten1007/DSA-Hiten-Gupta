package HeapsAndHashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HuffMannCoding {
    HashMap<Character, String> encoder = new HashMap<>();
    HashMap<String, Character> decoder = new HashMap<>();

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffMannCoding(String feeder) throws Exception{
        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i = 0; i < feeder.length(); i++){
            char cc = feeder.charAt(i);
            fmap.put(cc, fmap.getOrDefault(cc, 0) + 1);
        }
        Heaps<Node> minheap = new Heaps<Node>();
        Set<Map.Entry<Character, Integer>> set = fmap.entrySet();

        for(Map.Entry<Character,Integer> entry : set){
            Node node = new Node(entry.getKey(), entry.getValue());
            minheap.insert(node);
        }
        while(minheap.size() != 1){
            Node first = minheap.remove();
            Node second = minheap.remove();
            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;
            minheap.insert(newNode);
        }
        Node ft = minheap.remove();
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initencoderdecoder(ft, "");
    }
    private void initencoderdecoder(Node node, String osf){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initencoderdecoder(node.left, osf + "0");
        initencoderdecoder(node.right, osf + "1");
    }

    public String encode(String source){
        String ans = "";
        for(int i = 0; i < source.length(); i++){
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String encoded){
        String key = "";
        String ans = "";
        for(int i = 0; i < encoded.length(); i++){
            key = key + encoded.charAt(i);
            if(decoder.containsKey(key)){
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
