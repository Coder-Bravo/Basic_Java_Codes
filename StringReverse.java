public class StringReverse {
    public static void main(String[] args) {
        String mystring = "My name is Pratik";
        String rev = "";
        // Method 1 (using regular method)
       int n = mystring.length();
       for (int i = n-1; i>=0; i--) {
           rev = rev + mystring.charAt(i);
       }

        // Method 2 (using char[])
//        char[] chararray = mystring.toCharArray();
//        int n = chararray.length;
//        for (int i = n-1; i>=0; i--) {
//            rev = rev + chararray[i];
//        }

        // Method 3 (using StringBuffer)
//         StringBuffer sbf = new StringBuffer(mystring);
//         System.out.println(sbf.reverse());
//         System.out.println(rev);
    }
}
