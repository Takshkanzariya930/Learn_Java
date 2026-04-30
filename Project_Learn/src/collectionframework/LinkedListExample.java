package collectionframework;

import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Yellow");

        System.out.println(list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

    }

}
