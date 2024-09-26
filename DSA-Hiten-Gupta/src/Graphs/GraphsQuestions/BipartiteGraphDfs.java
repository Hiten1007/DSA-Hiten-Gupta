package Graphs.GraphsQuestions;

public class BipartiteGraphDfs {

    public static void main(String[] args) {
        int[][] graph = {{1,3,2},{0,2},{1,3,0},{0,2}};
        System.out.println(isBipartite(graph));
    }
    static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        for(int i = 0; i < n; i++){
            if(colors[i] == 0){
                colors[i] = 1;
                if(!dfs(i, graph, colors)){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean dfs(int i, int[][] graph, int[] colors) {
        for(int k = 0; k < graph[i].length; k++){
            if(colors[graph[i][k]] == 0){
                colors[graph[i][k]] = colors[i] == 1 ? 2 : 1;
                if(!dfs(graph[i][k], graph, colors)){
                    return false;
                }
            } else if (colors[i] == colors[graph[i][k]]) {
                return false;
            }
        }
        return true;
    }
}
