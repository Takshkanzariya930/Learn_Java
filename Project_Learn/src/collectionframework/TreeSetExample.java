package collectionframework;

import java.util.TreeSet;

public class TreeSetExample {
    
    public static void main(String[] args) {
        
        TreeSet<String> list = new TreeSet<>();

        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Red");

        System.out.println(list);

        list.remove("Red");

        System.out.println(list);

        System.out.println("First : "+list.first());

    }

}
