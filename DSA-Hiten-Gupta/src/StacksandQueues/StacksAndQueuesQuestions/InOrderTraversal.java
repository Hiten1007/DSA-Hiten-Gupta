package StacksandQueues.StacksAndQueuesQuestions;

import Trees.AVLTree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root != null) st.push(root);
        while(st.size() > 0){
            Node temp = st.peek();
            if(temp.left != null){
                st.push(temp.left);
                temp.left = null;
            }
            else{
                list.add(temp.data);
                st.pop();
                if(temp.right != null)st.push(temp.right);
            }
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
