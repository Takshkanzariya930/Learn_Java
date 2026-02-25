class OuterClass
{
    static class NestedClass
    {
        void my_method()
        {
            System.out.println("This is nested class");
        }
    }
}

class NestedInnerClassExample
{
    public static void main(String[] args)
    {
        OuterClass.NestedClass nested = new OuterClass.NestedClass();

        nested.my_method();
    }
}