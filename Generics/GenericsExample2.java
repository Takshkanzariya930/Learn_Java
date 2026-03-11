import java.util.ArrayList;

class GenericsExample2 {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Nisha");
        names.add("Sara");

        System.out.println(names.get(0));
    }
}
