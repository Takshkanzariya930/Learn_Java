package practice;

import java.util.Scanner;

class NegNumNotAllowed extends Exception
{
    NegNumNotAllowed(String msg)
    {
        super(msg);
    }
}

public class Question5 
{
    public static void main(String[] args) throws NegNumNotAllowed 
    {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        try 
        {
            for(int i=0; i<5; i++)
            {
                int temp = sc.nextInt();

                if (temp < 0) 
                    throw new NegNumNotAllowed("Negative Number Not Allowed");

                else
                    arr[i] = temp;
            }
        }
        catch (NegNumNotAllowed e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.print("Array : ");
            for (int i : arr) 
            {
                System.out.print(i+" ");    
            }

            sc.close();
        }
    }
}
