package collectionframework;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    
    public static void main(String[] args) {
        
        ArrayDeque<String> list = new ArrayDeque<>();

        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        
        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());



    }

}
