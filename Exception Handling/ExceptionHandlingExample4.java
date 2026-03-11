class ExceptionHandlingExample4
{
    public static void main(String[] args)
    {
        try
        {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bound");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divide something by zero");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Program Executed Completely");
        }
    }
}