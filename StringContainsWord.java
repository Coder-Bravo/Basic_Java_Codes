public class StringContainsWord {
    public static void main(String[] args) {
        String txt = "I am Pratik Baviskar";    //String Created
        String str1 = "Pratik";     // Searching word
        String str2 = "patil";      // Searching word

        // check if name is present in txt
        // using contains()
        boolean result = txt.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }
    }
}
