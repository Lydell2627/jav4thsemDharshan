public class prac4 {
    public static void main(String[] args) {
        // Random array for demonstration
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // Bubble Sort Logic to sort the array
        for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
        // Swap elements
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp; }
        }
        }
       
        // Minimum value is the first element after sorting
        int min = arr[0]; // First element is the minimum after sorting
        int max = arr[arr.length - 1]; // Last element is the maximum after sorting
        // Print the minimum and maximum values
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        }}
       

