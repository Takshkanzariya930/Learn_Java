package practice;

abstract class Shopping
{
    abstract void payment();
}

class DMart extends Shopping
{
    public void payment()
    {
        System.out.println("DMart Supports Cash Payment");
    }
}

class Amazon extends Shopping
{
    public void payment()
    {
        System.out.println("Amazon Support Online Payment");
    }
}

public class Question3 
{
    public static void main(String[] args) 
    {
        Shopping s;

        s = new DMart();
        s.payment();

        s = new Amazon();
        s.payment();
    }    
}
