interface String1
{
    String message = "Tutorialpoint";
}

interface String2
{
    String message = "Tutorix";
}

class InterfaceNamingCOnflictExample implements String1, String2
{
    public static void main(String[] args)
    {
        // InterfaceNamingCOnflictExample obj = new InterfaceNamingCOnflictExample();

        String1 obj = new InterfaceNamingCOnflictExample();

        // System.out.println(String1.message);
        // System.out.println(String2.message);
        System.out.println(obj.message);
    }
}