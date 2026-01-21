import java.util.Scanner ;

class Add
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter v1 : ");
        double v1 = obj.nextDouble();
        System.out.printf("Enter v2 : ");
        double v2 = obj.nextDouble();

        double result = v1 + v2 ;
        System.out.println("Result : "+ result);
    }
}