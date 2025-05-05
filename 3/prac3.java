import java.util.HashSet;

public class prac3 {
    
    public static int findDuplicate(int[] nums) {

HashSet<Integer> seen=new HashSet<Integer>();

 for (int num : nums) {
 if (seen.contains(num)) {
 return num;
 }
 seen.add(num);
 }
 return -1;
 }
 public static void main(String[] args) {
 int[] arr = {1, 3, 4, 2,4};
 System.out.println("Duplicate number: " + findDuplicate(arr)); }
}


