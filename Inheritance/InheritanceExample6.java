class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running.....");
    }
}

class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is running.....");
    }
}

class InheritanceExample6
{
    public static void main(String[] args)
    {
        Bike b = new Bike();

        b.run();
    }
}