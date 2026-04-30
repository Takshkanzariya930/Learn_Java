package innerclass;

abstract class AnonymousInnerClass
{
    public abstract void inner_method();
}

class OuterClass
{
    void outer_method()
    {
        AnonymousInnerClass inner = new AnonymousInnerClass() {
            public void inner_method()
            {
                System.out.println("This is an example of anonymous inner class");
            }
        };

        inner.inner_method();
    }
}

public class AnonymousInnerClassExample
{
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();

        outer.outer_method();
    }
}