interface Vehicle
{
    void start();

    interface Engine
    {
        void run();
    }
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car Started");
    }
}

class DieselEngin implements Vehicle.Engine
{
    public void run()
    {
        System.out.println("Engine is Running");
    }
}

class InterfaceInsideInterfaceExample
{
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        car.start();

        Vehicle.Engine engine = new DieselEngin();
        engine.run();
    }
}