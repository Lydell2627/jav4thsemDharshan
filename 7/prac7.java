// Design and develop an algorithm in Java to move all zeros in an ArrayList to the end while
// maintaining the order of non-zero elements
// Input : ArrayList: [0, 3, 0, 5, 2, 0]
// Output : Modified ArrayList: [3, 5, 2, 0, 0, 0] 


import java.util.*;


public class prac7 {
  public static void main(String[] args) {
    
  
  ArrayList<Integer> list = new ArrayList<>();
 list.add(0);
 list.add(3);
 list.add(0);
 list.add(5);
 list.add(2);
 list.add(0);
 ArrayList<Integer> result = new ArrayList<>();

 // Count the number of zeros
 int zeroCount = 0;
 // Add non-zero elements to result and count zeros
 for (int i = 0; i < list.size(); i++) {
 if (list.get(i) != 0) {
 result.add(list.get(i)); // Add non-zero elements
 } else {
 zeroCount++; // Count zeros
 }
 }
 // Add zeros to the end of result
 for (int i = 0; i < zeroCount; i++) {
 result.add(0);
 }
 // Output the result
 System.out.println("Modified ArrayList: " + result);
 
}}
