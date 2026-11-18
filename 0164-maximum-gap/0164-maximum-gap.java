import java.util.*;

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxi=0;
        if(nums.length<2)
        {
            return maxi;
        }
        for(int i=1;i<nums.length;i++)
        {
            maxi=Math.max(maxi, nums[i]-nums[i-1]);
        }
        return maxi;
    }
}