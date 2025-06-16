class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=nums[n-1];
        int diff=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>=max)
            {
                max=nums[i];
            }
            else
            {
                diff=Math.max(diff,max-nums[i]);
            }
        }
        return diff;
    }
}
