import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");

        // using character
        char ch = sc.next().charAt(0);

        // using String and convert it into char
//        String str = sc.next();   //define String
//        char ch = str.charAt(0);  //reads a character from string at the specified index value
        
        // using if-else
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

        // using switch-case
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(ch + " is vowel");
//                break;
//            default:
//                System.out.println(ch + " is consonant");
        }
    }
}
