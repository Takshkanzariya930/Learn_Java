package collectionframework;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Red");
        queue.add("Green");
        queue.add("Yellow");
        queue.add("Red");

        System.out.println(queue);

        System.out.println("Smallest Element : "+queue.poll());
        System.out.println("Next Smallest Element : "+queue.peek());
        // System.out.println("Next to Next Smallest Element : "+queue.peek());

    }

}
