class Bike
{
    final void run()
    {
        System.out.println("Bike is Running.....");
    }
}

class Honda extends Bike
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

        obj.run();  // Will give error since it will not be able to override method defined as 'final'
    }
}