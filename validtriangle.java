/*
Property of a triangle: sum of any two sides of a triangle is always greater than third side. We use this property to evaluate valid triangles.

*/

class Solution {
    public int triangleNumber(int[] nums) {
        
        int l = nums.length;
        Arrays.sort(nums);
        int count = 0;
        
        for(int i=0;i<l-2;i++)
        {
            for(int j=i+1;j<l-1;j++)
            {
                int k=j+1;
                while(k<l)
                {
                    if((nums[i]+nums[j])>nums[k])
                    count++;
                    else
                        break;
                    k++;
                }
            }
        }
        return count;
    }
}
