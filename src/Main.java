import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Iterator<Integer> iterator = text.chars().iterator();
        int i = iterator.next();
        System.out.println(i);
        char ch = (char) i;
        System.out.println(ch);
//        for (int i = 0; i < text.length(); i++) {
//            System.out.println(text.charAt(i));
//
//        }

    }
}