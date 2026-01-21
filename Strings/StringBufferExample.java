class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("World");
        StringBuffer str3 = new StringBuffer();
        
        str3 = str1.append(str2);
        System.out.println("append : "+str3);
        
        str1 = new StringBuffer("Hello");
        str3 = str1.insert(2, "Java");
        System.out.println("insert : "+str3);
        
        str3 = str2.replace(2, 5, "Java");
        System.out.println("replace : "+str3);
        
        str1 = new StringBuffer("Hello");
        str3 = str1.delete(3, 5);
        System.out.println("delete : "+str3);

        str3 = str2.reverse();
        System.out.println("reverse : "+str3);
    }
}