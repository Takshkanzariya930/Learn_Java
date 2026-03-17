package generics;

class Data<T>
{
    T value;

    void setValue(T value)
    {
        this.value = value;
    }

    T getValue()
    {
        return value;
    }
}

class GenericClassExample {
    public static void main(String[] args)
    {
        Data<Integer> d = new Data<>();

        d.setValue(12);

        System.out.println(d.getValue());
    }
}
