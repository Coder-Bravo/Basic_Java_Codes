import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = sc.nextInt();   int b = sc.nextInt();
        System.out.println("Numbers BEFORE swapping: " + "a = " + a + " and " + "b = " + b);
        // Method 1 (using third variable)
        int c = a;
        a = b;
        b = c;

        // Method 2 (using only 2 variables and +/- operators)
//        a = a + b;
//        b = a - b;
//        a = a - b;

        // Method 3 (using only 2 variables and *// operators)
//        a = a * b;
//        b = a / b;
//        a = a / b;

        // Method 4 (single statement)
//        b = (a+b) - (a = b);
        System.out.println("Numbers AFTER swapping : " + "a = " + a + " and " + "b = " + b);
    }
}
