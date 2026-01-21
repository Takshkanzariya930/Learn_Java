class StringExamples
{
    public static void main(String[] arg)
    {
        String s1 = "java";
        String s2 = "j2";

        System.out.println(s1.equals(s2));

        String firstName = "John ";
        String lastName = "Doe";

        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        String obj = new String("java obj");
        System.out.println(obj);
    }
}