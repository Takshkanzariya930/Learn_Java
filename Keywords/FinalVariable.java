class FinalVariable
{
    final int num = 101;

    // void change()
    // {
    //     num = 201;   // Can not change variable or methods or class defined as final
    // }

    public static void main(String[] args)
    {
        FinalVariable obj = new FinalVariable();

        // obj.change();

        System.out.println(obj.num);
    }
}