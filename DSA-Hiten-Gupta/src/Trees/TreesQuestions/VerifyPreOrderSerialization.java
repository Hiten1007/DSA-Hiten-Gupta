package Trees.TreesQuestions;

public class VerifyPreOrderSerialization {
    public boolean isValidSerialization(String preorder) {
        String[] tree = preorder.split(", ");
        int nodes = 1;

        for(int i = 0; i < tree.length; i++){
            if(nodes == 0){
                return false;
            }
            else if(tree[i].equals("#")){
                nodes--;
            }
            else{
                nodes++;
            }
        }
        return nodes == 0;
    }
}
