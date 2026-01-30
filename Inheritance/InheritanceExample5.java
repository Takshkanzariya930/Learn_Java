// Why is multiple inheritance is not supported in Java?
// - Multiple inheritance is not supported in java due to ambiguity problem and java show error at compile time and not run time that is why we are not able to run it. while in C++ all ambiguity or function with same name and parameters function will run as it handles it at run time.

class A
{
    void msg()
    {
        System.out.println("hello");
    }
}

class B
{
    void msg()
    {
        System.out.println("welcome");
    }
}

class C extends A, B
{
    int test = 0;
}

class InheritanceExample5
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.msg();
    }
}