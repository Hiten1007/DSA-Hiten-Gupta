package Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BFS extends BinaryTree{
    @Override
    public void display() {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        display(queue);
    }
    private void display(Queue<Node> queue){
        if(queue.isEmpty()){
            return;
        }
        Node node = queue.poll();
        System.out.print(node.value+ "->" );
        if(node.left != null){
        queue.add(node.left);
        } if(node.right != null){
            queue.add(node.right);
        }
        display(queue);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BFS();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }
}
