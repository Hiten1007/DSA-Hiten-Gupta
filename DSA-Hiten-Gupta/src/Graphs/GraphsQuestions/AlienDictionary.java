package Graphs.GraphsQuestions;

import java.util.*;

public class AlienDictionary {
    public String findOrder(String[] dict, int n, int k) {
        if(dict.length == 1){
            return dict[0];
        }
        HashMap<Character, List<Character>> map = new HashMap<>();

        HashMap<Character, Integer> inDegree = new HashMap<>();

        for(int i = 0 ; i < dict.length; i++){
            for(int j = 0; j < dict[i].length(); j++){
                if(!map.containsKey(dict[i].charAt(j))){
                    map.put(dict[i].charAt(j), new ArrayList<>());
                }
                if(!inDegree.containsKey(dict[i].charAt(j))){
                    inDegree.put(dict[i].charAt(j), 0);
                }
            }
        }

        for(int i = 0; i < dict.length - 1; i++){
            for(int j = 0; j < dict[i].length() && j < dict[i + 1].length(); j++){
                if(dict[i].charAt(j) != dict[i + 1].charAt(j)){
                        map.get(dict[i].charAt(j)).add((dict[i + 1].charAt(j)));
                        inDegree.put(dict[i + 1].charAt(j), inDegree.getOrDefault(dict[i + 1].charAt(j), 0) + 1);
                }
            }
        }

        Queue<Character> q = new LinkedList<>();

        StringBuilder res = new StringBuilder();
        for(Character c : inDegree.keySet()){
            if(inDegree.get(c) == 0){
                q.add(c);

            }
        }

        while(!q.isEmpty()){
            char c = q.remove();
            res.append(c);
            for(char ch : map.get(c)){
                inDegree.put(ch, inDegree.get(ch) - 1);
                if(inDegree.get(ch) == 0){
                    q.add(ch);
                }
            }
        }
        return res.toString();
    }
}
