class StringArray
{
    public static void main(String[] args)
    {
        String[] array ={"a", "b", "c", "d", "e", "f"};

        array[4] = "g";

        for(String i : array)
            System.out.println(i);
    }    

}