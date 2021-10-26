public class StringReverse {
    public static void main(String[] args) {
        String mystring = "My name is Pratik";
        String rev = null;
        for (int i = mystring.length()-1; i>=0; i--) {
            rev = rev + mystring.charAt(i);
        }
        System.out.println(rev);
    }
}
