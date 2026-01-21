class StringPoolExample
{
    public static void main(String[] args)
    {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java").intern();

        System.out.println("s1==s2 : " + (s1 == s2));
        System.out.println("s1==s3 : " + (s1 == s3));
        System.out.println("s1==s4 : " + (s1 == s4));
        
        s1 = s1.concat("J");
        System.out.println("s1 : "+s1);
        System.out.println("After changes s1==s2 : " + (s1 == s2));

    }
}