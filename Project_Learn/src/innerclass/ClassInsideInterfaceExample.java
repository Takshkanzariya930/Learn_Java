package innerclass;

interface Animal
{
    void sound();

    class Info
    {
        void display()
        {
            System.out.println("This is an animal");
        }
    }
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog Barks !!!!");
    }
}

interface Animal2
{
    void sound();

    abstract class Info
    {
        abstract void display();
    }
}

class Dog2 implements Animal2
{
    public void sound()
    {
        System.out.println("Dog2 Barks !!!!");
    }

    class Info
    {
        void display()
        {
            System.out.println("Test Case");
        }
    }
}

class ClassInsideInterfaceExample
{
    public static void main(String[] args)
    {
        Animal.Info info = new Animal.Info();
        info.display();

        Animal dog = new Dog();
        dog.sound();

        Animal2 dog2 = new Dog2();
        dog2.sound();

        Animal2 dog2 = new Dog2();
        dog2.info();
    }
}