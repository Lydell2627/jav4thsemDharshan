import java.util.*;
import java.util.Map.Entry;

public class prac6 {
     public static void main(String[] args) {

 Integer find=4;

 Map<Integer, String> map = new HashMap<>();
 map.put(3, "Cherry");
 map.put(1, "Apple");
 map.put(4, "Date");
 map.put(2, "Banana");
 // Sort the map by keys in ascending order using TreeMap
 Map<Integer, String> sortedMap = new TreeMap<>(map);


 Set<Entry<Integer, String>> s= sortedMap.entrySet();
 // Display the sorted Map elements using normal for-each loop
 for (Entry<Integer, String> entry : s) {

 if(entry.getKey().equals(find)) {
 System.out.println( entry.getValue());
 }
 }
 }
}
