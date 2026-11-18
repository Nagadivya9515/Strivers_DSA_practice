import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        if(nums.length==1)
        {
            lis.add(nums[0]);
            return lis;
        }
        Arrays.sort(nums);
        
        int threshold = nums.length / 3;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i]==nums[i-1])
            {
                count+=1;
            }
            else
            {
                count=1;
            }
            if(count == threshold+1)
            {
                lis.add(nums[i]);
            }
        }
        return lis;
    }
}