import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void containsKey(Map<Character, Integer> hashMap, char ch) {
            int value = hashMap.get(ch);
            value++;
            hashMap.put(ch, value);
    }

    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Iterator<Integer> iterator = text.chars().iterator();


        while (iterator.hasNext()) {
            int i = iterator.next();
            char ch = (char) i;

            if (!hashMap.containsKey(ch)) hashMap.put(ch, 1);
            else containsKey(hashMap, ch);
        }



    }
}
