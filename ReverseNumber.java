import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //Method 1 (regular algorithm)
        int rev = 0;
        while (number!=0) {     // 1234 123 12  1   0xxxxx
            rev = rev*10 + number%10;   //0*10 + 1234%10 = 0+4 = 4  //4321
            number =  number/10;    // 1234/10 = 123.4 ~ 123
        }

        //Method 2 (using StringBuffer)
//        StringBuffer rev;   //Reverse variable of StringBuffer type
//        StringBuffer sbf = new StringBuffer(String.valueOf(number)); //convert number into string & store it into sb
//        rev = sbf.reverse();     // store reversed number into rev
//        System.out.println("Reverse of number is: " + rev);

        //Method 2 (using StringBuilder)
//        StringBuilder rev;
//        StringBuilder sbl = new StringBuilder();
//        sbl.append(number);
//        rev = sbl.reverse();
//        System.out.println("Reverse of number is: " + rev);

    }
}
