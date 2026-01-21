class ParameterizedConstructor
{
    int id;
    String name;

    ParameterizedConstructor(int i, String n)
    {
        id = i;
        name = n;
    }

    public void display()
    {
        System.out.println("ID : "+id+", Name : "+name);
    }

    public static void main()
    {
        ParameterizedConstructor s101 = new ParameterizedConstructor(101, "Alex");
        ParameterizedConstructor s102 = new ParameterizedConstructor(112, "Bob");

        s101.display();
        s102.display();
    }
}