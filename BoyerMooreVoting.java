import java.util.*;
public class boyerMooreVoting {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;  // Increase count if the element matches the candidate
            } else {
                count--;  // Decrease count if it doesn't match the candidate
            }
        }

        // Step 2: Candidate is assumed to be the majority element
        return candidate;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = findMajorityElement(nums);

        System.out.println("Majority Element: " + majorityElement);
    }
}
