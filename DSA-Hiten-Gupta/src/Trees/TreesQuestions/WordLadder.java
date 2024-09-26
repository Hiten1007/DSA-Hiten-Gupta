package Trees.TreesQuestions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        HashSet<String> set = new HashSet<>();
        for(String a : wordList){
            set.add(a);
        }

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int count = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            count++;
            for(int i = 0; i < size; i++){
                String curr = q.poll();
                if(curr.equals(endWord)){
                    return count;
                }
                for(int j = 0; j < curr.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        String temp = curr.substring(0, j) + c + curr.substring(j + 1);
                        if(set.contains(temp)){
                            q.offer(temp);
                            set.remove(temp);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
