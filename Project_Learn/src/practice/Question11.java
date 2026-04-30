package practice;

import java.io.*;
 
public class Question11 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/practice/file1.txt");

            int ch;
            int vowelsCount = 0;
            int consonantsCount = 0;
            String vowels = "aeiouAEIOU";
            
            while((ch = fis.read()) != -1)
            {
                if(vowels.indexOf((char) ch) != -1)
                {
                    vowelsCount++;
                }
                else
                {
                    consonantsCount++;
                }
            }

            System.out.println("No. of Vowels are "+vowelsCount);
            System.out.println("No. of Conconants are "+consonantsCount);

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
