class ConstructorExample2
{
    int num1;
    int num2;

    ConstructorExample2()
    {
        num1 = -1;
        num2 = -1;
    }

    public static void main(String[] args)
    {
        ConstructorExample2 obj = new ConstructorExample2();

        System.out.println("num1 : "+obj.num1);
        System.out.println("num2 : "+obj.num2);
    }
}