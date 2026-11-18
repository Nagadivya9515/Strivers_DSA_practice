class Solution {
    public int[] runningSum(int[] nums) {
        int prev_sum=0;
        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            prev_sum=prev_sum+nums[i];
            res[i]=prev_sum;
        }
        return res;
    }
}