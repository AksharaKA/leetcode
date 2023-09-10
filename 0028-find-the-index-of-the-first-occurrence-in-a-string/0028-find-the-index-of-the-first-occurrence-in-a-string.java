class Solution {
    public int strStr(String haystack, String needle) {
        boolean ans;
        ans=haystack.contains(needle);
        if(ans)
        {   int result;
        result=haystack.indexOf(needle);
        return result;

        }
            return -1;

    }
}