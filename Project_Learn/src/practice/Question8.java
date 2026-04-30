package practice;

public class Question8 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Enter exactly three values.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            int largest;

            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }

            System.out.println("Largest element is " + largest);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}