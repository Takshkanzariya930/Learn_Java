class Test
{
    interface MyInterface
    {
        void demo();
    }
}

class Sample implements Test.MyInterface
{
    public void demo()
    {
        System.out.println("Hello World !!!");
    }
}

class InterfaceInsideClassExample
{
    public static void main(String[] args)
    {
        Sample obj = new Sample();

        obj.demo();
    }
}