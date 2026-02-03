abstract class Bank
{
    abstract float getintrestrate();
}

class SBI extends Bank
{
    float getintrestrate(){return 7.3f;}
}

class PNB extends Bank
{
    float getintrestrate(){return 8.3f;}
}

class AbstractKeyword3
{
    public static void main(String[] args)
    {
        Bank b;

        b = new SBI();
        System.out.println(b.getintrestrate());
    }
}