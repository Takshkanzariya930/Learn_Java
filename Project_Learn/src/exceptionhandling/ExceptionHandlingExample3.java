package exceptionhandling;

class ExceptionHandlingExample3
{
    public static void main(String[] args)
    {
        try
        {
            String test = null;
            System.out.println(test.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Cleaning Up...");
        }
    }
}