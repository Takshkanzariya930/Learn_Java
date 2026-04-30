package collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {    
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Red");
        names.add("Green");
        names.add("Yellow");
        names.add("Red");

        System.out.println(names);

        names.remove("Green");

        System.out.println(names);

        System.out.println("Contains Green : "+names.contains("Green"));

    }

}