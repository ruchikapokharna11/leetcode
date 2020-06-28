class Solution {
    public int strStr(String haystack, String needle) {
        int result = 0;
        if(needle==null)
        {
            result = 0;
        }
        else if(haystack.contains(needle))
        {
            result =  haystack.indexOf(needle);
        }
        else
        {
            result = -1;
        }
         return result;   
    }
}
