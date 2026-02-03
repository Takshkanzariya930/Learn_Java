interface printable
{
    void print();
}

interface showable
{
    void print();
}

class A implements printable, showable
{
    public void print()
    {
        System.out.println("Hello");
    }
}

class MultipleInheritanceExample2
{
    public static void main(String[] args)
    {
        A obj = new A();

        obj.print();
    }
}