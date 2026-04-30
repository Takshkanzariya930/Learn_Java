package filehandling;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferInputStreamExample {
    
    public static void main(String[] args) {
        try 
        {
            FileInputStream fis = new FileInputStream("/home/taksh/Coding/Learn/Learn_java/Project_Learn/src/filehandling/sample.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;

            System.out.println();

            while ((i = bis.read()) != -1)    
            {
                // System.out.println(i);
                System.out.print((char) i);
            }

            System.out.println();

            fis.close();
            bis.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

}
