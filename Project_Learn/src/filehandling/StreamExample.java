package filehandling;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30 ,40 ,50);

        list.stream().filter(x -> x > 20).map(x -> x*2).forEach(System.out::println);
    }

}
