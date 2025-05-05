// Write a Java program to remove duplicate elements from an ArrayList .
// Input : ArrayList: [4, 2, 4, 5, 2, 6, 7, 5]
// output : Unique Elements: [4, 2, 5, 6, 7]



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
   