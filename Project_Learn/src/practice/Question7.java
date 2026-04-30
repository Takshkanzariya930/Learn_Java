package practice;

import java.io.*;

public class Question7 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream("src/practice/file1.txt");
            FileOutputStream fos = new FileOutputStream("src/practice/file2.txt");

            int ch;

            while ((ch = fis.read()) != -1) 
            {
                fos.write(ch);;
            }

            fis.close();
            fos.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }    
}
