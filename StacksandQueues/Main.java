package StacksandQueues;

public class Main {
    public static void main(String[] args) throws Exception{
//        CustomStack stack = new CustomStack(5);
//
//        stack.push(18);
//        stack.push(4);
//        stack.push(3);
//        stack.push(5);
//        stack.push(7);
//        stack.push(78);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        CustomQueue queue = new CustomQueue(5);

        queue.insert(5);
        queue.insert(1);
        queue.insert(6);
        queue.insert(2);
        queue.insert(4);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
