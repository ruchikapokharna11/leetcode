class Solution {
    public int balancedStringSplit(String s) {
         char [] charArr = s.toCharArray();
        int count = 0;
        int temp = 0;
        for(char c:charArr)
        {
            
            if(c=='L')
            {
                temp--;
            }
            else
            {
                temp++;
            }
            if(temp==0)
            {
                count++;
            }
        }
        return count;
        
        
    }
}
