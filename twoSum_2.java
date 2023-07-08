//Comments are auto generated using Bard.
//Problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right)
        {
            // Calculate the sum of the elements at indices left and right.
            int sum = numbers[left]+numbers[right];

            // If the sum is equal to the target, return an array with the indices left + 1 and right + 1.
            if(sum==target)
            return new int[]{left + 1, right + 1};

            // If the sum is less than the target, increment left.
            if(sum<target)
            left++;

            // If the sum is greater than the target, decrement right.
            else
            right--;
        }

        // If the loop exits without finding two elements whose sum is equal to the target, return an empty array.
        return ret;
    }
}

