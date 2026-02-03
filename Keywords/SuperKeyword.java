class Animal
{
    String color = "white";
}

class Dog extends Animal
{
    String color = "black";

    void printcolor()
    {
        System.out.println(this.color);
        System.out.println(super.color);

    }
}

class SuperKeyword
{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.printcolor();
    }
}