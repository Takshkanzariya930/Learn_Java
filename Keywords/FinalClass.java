final class Bike
{
    void run()
    {
        System.out.println("Bike is Running.....");
    }
}

class Honda extends Bike // Will give error since it will not be able to extend class defined as 'final'
{
    final void run()
    {
        System.out.println("Honda is Running.....");
    }
}

class FinalMethod
{
    public static void main(String[] args)
    {
        Honda obj = new Honda();

        obj.run();
    }
}