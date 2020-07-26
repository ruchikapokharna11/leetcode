class Solution {
    public String restoreString(String s, int[] indices) {
        char []arr = s.toCharArray(); 
        char []newArr = new char[s.length()];
        for(int i = 0;i<arr.length;i++)
        {
            newArr[indices[i]] = arr[i];
        }
        return new String(newArr);
    }
}
