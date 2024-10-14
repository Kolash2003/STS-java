import java.util.*;
public class LeadersInArray {
    public static void findLeaders(int[] nums) {
        int n = nums.length;

        // The rightmost element is always a leader
        int max = nums[n - 1];
        System.out.print(max, " ");
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                System.out.print(max, " ")  // Add to leaders list
            }
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        findLeaders(nums);
    }
}
