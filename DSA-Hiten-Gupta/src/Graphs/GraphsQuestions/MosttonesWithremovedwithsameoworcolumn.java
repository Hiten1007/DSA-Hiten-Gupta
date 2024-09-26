package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DisJoint {
    ArrayList<Integer> size = new ArrayList<>();
    ArrayList<Integer> parent = new ArrayList<>();

    public DisJoint(int n) {
        for (int i = 0; i < n; i++) {
            size.add(1);
            parent.add(i);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int u = findUPar(parent.get(node));
        parent.set(node, u);
        return u;
    }

    public void UnionBySize(int u, int v) {
        int ulu = findUPar(u);
        int ulv = findUPar(v);
        if (size.get(ulu) > size.get(ulv)) {
            parent.set(ulv, ulu);
            size.set(ulu, size.get(ulu) + size.get(ulv));
        } else {
            parent.set(ulu, ulv);
            size.set(ulv, size.get(ulu) + size.get(ulv));
        }
    }
}

public class MosttonesWithremovedwithsameoworcolumn {
    public int removeStones(int[][] stones) {
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < stones.length; i++){
            maxRow = Math.max(maxRow, stones[i][0]);
            maxCol = Math.max(maxCol, stones[i][1]);
        }
        DisJoint set = new DisJoint(maxRow + maxCol + 1);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] stone : stones){
            int row = stone[0];
            int col = stone[1] + maxRow + 1;
            set.UnionBySize(row, col);
            map.put(row, 1);
            map.put(col, 1);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(set.findUPar(entry.getKey()) == entry.getKey()){
                count++;
            }
        }
        return stones.length - count;
    }
}
