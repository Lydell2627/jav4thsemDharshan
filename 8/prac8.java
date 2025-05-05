import java.util.*;

public class prac8 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(2);
    list.add(4);
    list.add(5);
    list.add(2);
    list.add(6);
    list.add(7);
    list.add(5);
    HashSet<Integer> uniqueSet = new HashSet<>(list);
    ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);
    System.out.println("Unique Elements: " + uniqueList);
    }
   }
   