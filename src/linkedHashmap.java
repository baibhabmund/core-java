import java.util.LinkedHashMap;
public class linkedHashmap {
    public static void main(String[] args) {
       /*
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Mango", 200);
        map.put("Apple", 150);
        map.put("Banana", 180);

        System.out.println("The HashMap is : " + map);

        */
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Alice", 1234);
        map.put("Charlie", 4323);
        map.put("Bob", 3213);

        //Updating the Value
        map.put("Charlie", 4321);
        System.out.println("The Updated Map = " + map);
    }
}
