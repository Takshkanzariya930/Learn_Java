package collectionframework;

import java.util.HashSet;

public class HashSetExample {
    
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Red");
        names.add("Green");
        names.add("Yellow");
        names.add("Red");

        System.out.println(names);

        names.remove("Green");

        System.out.println(names);

        System.out.println("Contains Red :"+names.contains("Red"));

    }

}
