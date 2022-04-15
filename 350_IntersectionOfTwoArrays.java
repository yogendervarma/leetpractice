/*
A basic bruteforce approach for this problem is to Sort both given input arrays, and traverse the sorted array.

if we find same value in both arrays at any index (or indices), we store that value in a List (Or dynamic array of you prefer that).

Else, we increment the iterator index values for the lower value in both arrays. Repeat until we reach end of either array.

*/ 


List<Integer> ret = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int l=nums1.length,m=nums2.length;
        while(i<l && j<m)
        {
            if(nums1[i]==nums2[j])
            {
                ret.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        int[] arr = new int[ret.size()];
        for(i=0;i<ret.size();i++)
            arr[i]=ret.get(i);
        return arr;




/*

Another approach for this would be to use a HashMap.

We iterate the first array and store the values, number of occurences in a hashmap. Then we iterate second array, and see if the elements 
of second array are present in hashmap as keys. If they are, we add the elemnt in a result arraylist, and decrement the value in hashmap 
(or remove the element from hashmap if the value is 1).


*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int i:nums1)
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        List<Integer> list = new ArrayList<>();
        
        for(int i:nums2)
            if(hm1.containsKey(i))
            {
                list.add(i);
                
                if(hm1.get(i)>1)
                hm1.put(i,hm1.get(i)-1);
                    else
                        hm1.remove(i);
            }
        int[] ret = list.stream().mapToInt(i -> i).toArray();
        return ret;
        
    }
}
