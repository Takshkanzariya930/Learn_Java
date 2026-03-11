import java.util.ArrayList;

class GenericsExample {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");

        String s = list.get(0);
        System.out.println(s);
    }
}