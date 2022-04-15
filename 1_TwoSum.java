/*
basic brute force approach would be to calculate the difference from target to current value, and then check in the reminder of array if that value exists.

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            int check = target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==check)
                {
                    ret[0]=i;ret[1]=j;
                    return ret;
                }
            }
        }
        return ret;
    }
}



/*
A more simplified and optimal solution, would be to use a HashMap.

We'll use a hashmap to store the int that we pass by. Simultaneously, we'll check the difference to sum and current integer, 
and see if the diff value exists as a key within hashmap. If it does, we return these 2 numbers.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==2)
            return new int[]{0,1};
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            int cur = target-nums[i];
            if(hm.containsKey(cur))
                return new int[]{hm.get(cur),i};
            hm.put(nums[i],i);
        }
        return new int[]{0,1};
    }
}
