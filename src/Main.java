//override equals() and hashCode()
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void containsKey(Map<Character, Integer> hashMap, char ch) {
            int value = hashMap.get(ch);
            value++;
            hashMap.put(ch, value);
    }
//    public static void cleanMap(Map<Character, Integer> hashMap) {
//
//}
//    public static int findTheBiggest(Map<Character, Integer> hashMap2, int min) {
//
//        return min;
//    }

    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Iterator<Integer> iterator = text.chars().iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();
            char ch = (char) i;

            if (!hashMap.containsKey(ch)) hashMap.put(ch, 1);
            else containsKey(hashMap, ch);
        }

        List<Map.Entry<Character, Integer>> hashMap1 =
                hashMap.entrySet().stream().filter(n -> Character.isLetter(n.getKey())).collect(Collectors.toList());
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> e : hashMap1) {
//            if (e.getValue() > min) {
//                min = e.getValue();
//            }
            System.out.println(e);


        }
    }
}
