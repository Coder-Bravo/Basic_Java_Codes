import java.util.*;

public class StringToStringArray {
    public static void main(String[] args) {
        // Method 1 (using String.split() method)
        //declaring and initializing a string
//        String str = "Converting string to string array using split() method";
//        //declaring an empty string array
//        String[] strArray = null;
//        //converting using String.split() method with whitespace as a delimiter
//        strArray = str.split(" ");
//        //printing the converted string array
//        for (int i = 0; i< strArray.length; i++){
//            System.out.println(strArray[i]);
//        }

        // Method 2 (using String[] and .toString() method)
        //declaring and initializing a string
        String str = "Converting string to string array using String[]";
        //passing the string to String[] {}
        String[] strArray = new String[] {str};
        //printing the string array using Arrays.toString()
        System.out.println(Arrays.toString(strArray));
    }
}
