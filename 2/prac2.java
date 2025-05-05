// Design and develop an algorithm to implement Linear Search in Java to find a given element in an
// array and display its position
// Input : int[] arr = {3, 5, 7, 2, 8, 4, 10};
//  int target = 8;
// Output : Element 8 found at index: 4

public class prac2 {
    public static void main(String[] args) {
        // Example array and target (hardcoded)
        int[] arr = {3, 5, 7, 2, 8, 4, 10};
        int target = 8; // Target to search for
       
        // Linear Search Logic (inside main)
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
        result = i; // If element is found, store its index
        break; // Exit the loop as we've found the target
        } }
       
        // Display the result
        if (result != -1) {
        System.out.println("Element " + target + " found at index: " + result);
        } else {
        System.out.println("Element " + target + " not found.");
      
        } }
}
