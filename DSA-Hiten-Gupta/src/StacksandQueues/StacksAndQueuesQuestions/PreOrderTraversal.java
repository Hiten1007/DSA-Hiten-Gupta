package StacksandQueues.StacksAndQueuesQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            Node temp = st.peek();
            list.add(temp.data);
            st.pop();
            if(temp.right != null) st.add(temp.right);
            if(temp.left != null) st.add(temp.left);
        }
        return list;
    }
    public class Node{
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    private Node root;
}
