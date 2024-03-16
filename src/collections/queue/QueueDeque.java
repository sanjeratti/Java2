package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDeque {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Zamira");
        priorityQueue.add("Zarina");
        priorityQueue.add("Sanzhar");



        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }

//        Sanzhar
//        Zamira
//        Zarina

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Zamiwka");
        deque.addFirst("Zarina");
        deque.addLast("Sanxho");
        System.out.println(deque); //
        System.out.println(deque.getLast()); //
        System.out.println(deque.getFirst()); //

        System.out.println(deque.pop()); //Zarinka
        System.out.println(deque); // [Zamiwka, Sanzho]
        System.out.println(deque.poll()); // Zamiwka
        System.out.println(deque.pop()); // [Sancho]
        System.out.println(deque); // []
        System.out.println(deque.poll()); // null
        System.out.println(deque.pop()); // NoSuchElementException


    }
}
