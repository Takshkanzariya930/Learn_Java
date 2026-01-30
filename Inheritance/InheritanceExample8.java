class Bank
{
    float getintrestrate()
    {
        return 0;
    }
}

class SBI extends Bank
{
    float getintrestrate()
    {
        return 8.4f;
    }
}

class ICICI extends Bank
{
    float getintrestrate()
    {
        return 7.3f;
    }
}
class AXIS extends Bank
{
    float getintrestrate()
    {
        return 9.7f;
    }
}

class InheritanceExample8
{
    public static void main(String[] args)
    {
        Bank b;

        b = new SBI();
        System.out.println("SBI rate of interest "+b.getintrestrate());

        b = new ICICI();
        System.out.println("ICICI rate of interest "+b.getintrestrate());

        b = new AXIS();
        System.out.println("AXIS rate of interest "+b.getintrestrate());
    }   
}