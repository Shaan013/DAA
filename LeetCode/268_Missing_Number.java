class Solution {
    // Sort method to sort the array
    public void sort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {  // Fix the loop start condition
            for (int j = i + 1; j < len; j++) {  // Fix the loop condition
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    // Method to find the missing number
    public int missingNumber(int[] nums) {
        // Sort the array
        sort(nums);
        
        // Print the sorted array for debugging
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Find the missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        // If no number is missing in the range, return the next number
        return nums.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 0};
        Solution s = new Solution();
        int missing = s.missingNumber(array);
        System.out.println("Missing number: " + missing);
    }
}
