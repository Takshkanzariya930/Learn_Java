interface printable
{
    void print();
}

interface showable
{
    void show();
}

class A implements printable, showable
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

class MultipleInheritanceExample
{
    public static void main(String[] args)
    {
        A obj = new A();

        obj.print();
        obj.show();
    }
}