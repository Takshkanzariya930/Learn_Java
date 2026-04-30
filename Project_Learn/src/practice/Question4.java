package practice;

import java.util.ArrayList;

public class Question4 
{
    public static void main(String[] args) 
    {
        ArrayList<String> books = new ArrayList<>();
        
        books.add("Title A");
        books.add("Title B");
        books.add("Title C");

        System.out.println(books);

        books.remove("Title B");

        System.out.println(books);

        books.set(0, "Title D");

        System.out.println(books);
    }    
}
