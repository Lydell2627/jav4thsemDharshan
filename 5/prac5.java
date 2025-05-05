// Design and develop an algorithm in Java to sort a HashMap by keys using TreeMap and display the
// sorted values.
//  Input : (3, "Cherry") (1, "Apple") (4, "Date") (2, "Banana")
//  Output:
// 1 : Apple
// 2 : Banana
// 3 : Cherry
// 4 : Date 


import java.util.*;
import java.util.Map.Entry;
public class prac5 {
    public static void main(String[] args) {
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
        
         System.out.println(entry.getKey()+" : "+ entry.getValue());
        
         }
         }
}
