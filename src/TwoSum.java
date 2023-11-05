import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        // Initialize two pointers, one at the beginning and the other at the end
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            // If the sum is equal to the target, return the indices
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer forward
                left++;
            } else {
                // If the sum is greater than the target, move the right pointer backward
                right--;
            }
        }

        // If no solution is found, return an empty array
        return new int[0];
    }

    // Example usage
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
