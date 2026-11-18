import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 8 1 2 2 3 - 0 1 2 3 4
        // 1 2 2 3 8 - 
        // 
        // Arrays.sort(nums);
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count+=1;
                }
            }
            res[i] = count;
        }
        return res;
    }
}