import com.sun.source.tree.Tree;

import java.util.TreeMap;
public class treeMap {
    public static void main(String[] args) {
        /*TreeMap<String, Integer> map = new TreeMap<>();

        String str1 = "Alice";
        String str2 = "John Dow";
        String str3 = "Bob";

        map.put(str1, str1.length());
        map.put(str2, str2.length());
        map.put(str3, str3.length());

        System.out.println("The Map is : " + map);
         */
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Steve");
        map.put(201, "David");
        map.put(303, "Jhon");

        int first_key = map.firstKey();
        int last_key = map.lastKey();
        System.out.println("First Key = " + first_key);
        System.out.println("Last Key = " + last_key);

    }
}
