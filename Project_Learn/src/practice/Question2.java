package practice;

interface Vehical
{
    int ModelNo = 101123;
    int SpeedLimit = 120;

    public void getData();

    public void DisplayData();
}

class Bike implements Vehical
{
    String name;

    public void DisplayData()
    {
        name = "Bike";
    }

    public void getData()
    {
        System.out.println("Name : " + name);
        System.out.println("Model No. : " + ModelNo);
        System.out.println("Speed Limit : " + SpeedLimit);        
    }
}

class Car implements Vehical
{
    String name;

    public void DisplayData()
    {
        name = "Car";
    }

    public void getData()
    {
        System.out.println("Name : " + name);
        System.out.println("Model No. : " + ModelNo);
        System.out.println("Speed Limit : " + SpeedLimit);        
    }
}
    
public class Question2 
{
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();

        b.DisplayData();
        b.getData();

        c.DisplayData();
        c.getData();
    }    
}
