interface printable
{
    void print();
}

class A implements printable
{
    public void print() //Why public is being written
    {
        System.out.println("Hello World");
    }
}

class InterfaceExample
{
    public static void main(String[] args)
    {
        A obj = new A();

        obj.print();
    }
}