package Trees.TreesQuestions;

public class kthAncestorNode {
    class TreeAncestor {

        int n;
        int[] parent;
        public TreeAncestor(int n, int[] parent) {
            this.n = n;
            this.parent = parent;
        }

        public int getKthAncestor(int node, int k) {
            int height = (int)(Math.log(n));
            int ans = -1;
            for(int i = 0; i < k && i < height; i++){
                ans = parent[node];
                node = ans;
            }
            return ans;
        }
    }
}
