interface printable
{
    void print();
}

interface showable extends printable
{
    void show();
}

class A implements showable
{
    public void print()
    {
        System.out.println("Hello");
    }

    public void show()
    {
        System.out.println("World");
    }

}

class InterfaceExample2 
{
    public static void main(String[] args)
    {
        A obj = new A();

        obj.print();
        obj.show();
    }
}