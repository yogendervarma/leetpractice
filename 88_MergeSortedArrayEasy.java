/*
Leetcode problem 88

Merging two sorted arrays into a fully sorted array, in place (result must be stored in first array. it accomodates length)

Since the arrays are already sorted, the idea is to add the numbers into the first array in reverse direction. (filling array in descending order)
by iterating both arrays in reverse.

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,l=nums1.length,k=l-1;
        
        while(j>=0 && i>=0)
        {
            nums1[k]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
            k--;
        }
         while(i>=0)
            nums1[k--]=nums1[i--];
        while(j>=0)
            nums1[k--]=nums2[j--];
       
    }
}
