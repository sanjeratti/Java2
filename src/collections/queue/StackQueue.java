package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.add(5);
        stack1.add(0);
        stack1.add(6);
        stack1.add(9);
        System.out.println(stack1);        // [5, 0, 6, 9]
        System.out.println(stack1.pop());  //9
        System.out.println(stack1);        // [5, 0, 6]

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(0);
        queue.add(6);
        queue.add(9);
        System.out.println(queue);        // [0, 5, 6, 9]
        System.out.println(queue.poll()); // 0
        System.out.println(queue);        // [5, 9, 6]



    }
}
