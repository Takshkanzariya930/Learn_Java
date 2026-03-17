package innerclass;

class OuterClass
{
    private class InnerClass
    {
        void print()
        {
            System.out.println("This is Inner Class.");
        }
    }

    void display()
    {
        InnerClass inner = new InnerClass();
        inner.print();
    }
}

class InnerClassExample
{
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();
        outer.display();
    }
}