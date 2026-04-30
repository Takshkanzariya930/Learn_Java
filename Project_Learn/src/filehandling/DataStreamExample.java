package filehandling;

import java.io.*;

public class DataStreamExample {
    
    public static void main(String[] args) {
       
        try 
        {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/filehandling/data.txt"));

            dos.writeInt(12);
            dos.writeDouble(15.65);

            for (int i=0; i<=10; i++)
            {
                dos.writeInt(i);
            }   

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("src/filehandling/data.txt"));

            int num = dis.readInt();
            double d = dis.readDouble();

            System.out.println("Integer : "+num);
            System.out.println("Double : "+d);

            for (int i=0; i<=10; i++)
            {
                num = dis.readInt();
                System.out.println(num);
            }  

            dis.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

      

    }

}
