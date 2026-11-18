class Solution {
    public int[] shuffle(int[] nums, int n) {
        int maxVal = 1001; // Larger than max constraint (1000)

        // Step 1: Store both x_i and y_i inside the second half of the array
        for (int i = 0; i < n; i++) {
            nums[i + n] += nums[i] * maxVal;
        }

        // Step 2: Extract x_i and y_i into their final positions from left to right
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[i + n] / maxVal;     // Original x_i
            nums[2 * i + 1] = nums[i + n] % maxVal; // Original y_i
        }

        return nums;
    }
}
