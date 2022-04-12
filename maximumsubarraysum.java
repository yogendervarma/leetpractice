class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int maxsum = Integer.MIN_VALUE, max = 0;
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            max +=nums[i];
            maxsum = Math.max(max,maxsum);
            max = Math.max(max,0);
        }
        return maxsum;
    }
}
