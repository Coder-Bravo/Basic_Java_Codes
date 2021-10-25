import java.util.Scanner;  
public class DigitCounter {  
    public static void main(String[] args) {  
        int num = 1234587424;   // number
        int count = 0;          // Initialize count = 0
        
        // loop will break at num becomes 0
        while(num>0) {
            num = num/10;       // everytime num gets divide by 10
            count++;            // divided count gets stored in "count"
        }
        System.out.println("No of digits are: " + count);
    }  
} 

// Output:
// No of digits are: 10
