package practice;

abstract class Calculator {
    int result;

    abstract void sum2(int a, int b);

    abstract void sum3(int a, int b, int c);

    void display() {
        System.out.println("Addition is " + result);
    }
}

class Addition extends Calculator {
    void sum2(int a, int b) {
        result = a + b;
        display();
    }

    void sum3(int a, int b, int c) {
        result = a + b + c;
        display();
    }
}

public class Question10 {
    public static void main(String[] args) {
        Addition obj = new Addition();

        obj.sum2(1, 4);
        obj.sum3(4, 6, 8);
    }
}
