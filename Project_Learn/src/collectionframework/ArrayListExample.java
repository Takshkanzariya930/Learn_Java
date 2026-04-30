package collectionframework;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); 

        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(1);

        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(list.size());

        System.out.println(list);

    }

}
