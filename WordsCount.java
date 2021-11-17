
import java.util.HashMap;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String str = sc.nextLine();
        String str = "This this is done by Coder Bravo Coder is good boy not DJ";
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}
