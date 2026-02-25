class OuterClass
{
    void my_method()
    {
        int num = 23;

        class MethodInnerClass
        {
            public void print()
            {
                System.out.println("This is method Inner class "+num);
            }
        }

        MethodInnerClass inner = new MethodInnerClass();
        inner.print();
    }
}

class MethodInnerClassExample
{
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();

        outer.my_method();
    }
}