class Animal
{
    void sound()
    {
        System.out.println("Animals makes sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog is barking");
    }

    void breed()
    {
        System.out.println("Labrador");
    }
}

class InheritanceExample7
{
    public static void main(String[] argss)
    {
        Animal a = new Dog();

        a.sound();
        // a.breed();
    }
}