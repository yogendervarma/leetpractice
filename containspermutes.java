/*
Check if a string S2 contains permiutations of another string S1 in any order 

*/


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int l1 = s1.length();
        int l2 = s2.length();
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        
        for(char c:s1.toCharArray())
            arr[c-'a']++;
        for(char c:s2.toCharArray())
            arr2[c-'a']++;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0 && arr[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
