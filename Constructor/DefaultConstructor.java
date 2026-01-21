// Default constructor is called when you have not created any constructor but you are making an object.

class DefaultConstructor
{
    int num1;
    int num2;

    public static void main(String[] args)
    {
        DefaultConstructor obj = new DefaultConstructor();

        System.out.println("num1 : "+obj.num1);
        System.out.println("num2 : "+obj.num2);
    }
}