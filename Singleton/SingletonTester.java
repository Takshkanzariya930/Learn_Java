class Singleton
{
    private static Singleton singleton = new Singleton();

    private Singleton()
    {
    }

    public static Singleton getinstance()
    {
        return singleton;
    }

    protected void demoMethod()
    {
        System.out.println("demoMethod for singleton");
    }
}

class SingletonTester
{
    public static void main(String[] args)
    {
        Singleton tmp = Singleton.getinstance();
        tmp.demoMethod();

    }
}