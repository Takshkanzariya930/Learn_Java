import java.util.Scanner ;

class Array
{
    public static void main(String[] arg)
    {
        String[] cars = {"Volvo", "BMW", "Toyota", "Ford"};
        System.out.printf("%s\n", cars[0]);

        System.out.printf("%d\n", cars.length);

        for(int i=0; i<cars.length; i++)
        {
            System.out.println(cars[i]);
        }

        for(String j : cars)
        {
            System.out.println(j);
        }
    }
}