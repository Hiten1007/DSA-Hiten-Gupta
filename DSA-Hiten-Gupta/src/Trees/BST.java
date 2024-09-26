package Trees;

public class BST {
    public class Node{
        private int value;
        private Node right;
        private Node left;
        int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    public BST(){

    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root value is : ");
    }

    public void insert(int value){
       root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(node.value > value){
            node.left = insert(node.left, value);
        }
        if(node.value < value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0 , nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;

        this.insert(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " :" );
        display(node.right, "Right child of " + node.getValue() + " :" );
    }
}
