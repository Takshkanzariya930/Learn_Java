class ConstructorOverloading
{
    int id;
    String name;
    int age;

    ConstructorOverloading()
    {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }

    ConstructorOverloading(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    ConstructorOverloading(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("ID : "+id+", Name : "+name+", Age : "+age);
    }

    public static void main(String[] args)
    {
        ConstructorOverloading obj1 = new ConstructorOverloading(101, "Alex");
        ConstructorOverloading obj2 = new ConstructorOverloading(102, "Bob", 14);
        ConstructorOverloading obj3 = new ConstructorOverloading();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}