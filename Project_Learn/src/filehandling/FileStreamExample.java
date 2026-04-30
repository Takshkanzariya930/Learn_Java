package filehandling;

import java.io.*;

public class FileStreamExample {
    
    public static void main(String[] args) {
        try 
        {
            FileOutputStream fos = new FileOutputStream("src/filehandling/sample.txt", true);

            String data = "Hello File";

            byte[] b = data.getBytes();

            fos.write(b);

            fos.close();

            FileInputStream fis = new FileInputStream("src/filehandling/sample.txt");

            int i;

            System.out.println();

            while ((i = fis.read()) != -1)    
            {
                // System.out.println(i);
                System.out.print((char) i);
            }

            System.out.println();

            fis.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

}
