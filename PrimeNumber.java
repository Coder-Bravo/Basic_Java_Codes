import java.util.Scanner;

public class PrimeNumber {
    // Method 1
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num>1) {
            for (int i = 1; i<=num; i++) {
                if (num%i == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is NOT Prime!!!");
            }
        } else {
            System.out.println(num + " is Not Prime!!!");
        }
    }

    // Method 2
//     public static void main(String[] args) {
//         int i = 0, temp = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number- ");
//         int n = sc.nextInt();
//         for (i = 2; i <= (n / 2); i++) {
//             if (n % i == 0) {
//                 temp = 1;
//                 break;
//             }
//         }
//         if (temp == 1)
//             System.out.println("Number is not a prime");
//         else
//             System.out.println("Number is prime");
//     }
}
