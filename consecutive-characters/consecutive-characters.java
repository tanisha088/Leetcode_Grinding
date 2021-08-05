class Solution {
    public int maxPower(String s) {
        int i=0;
        int res=1;
        while(i<s.length())
        {
            char c = s.charAt(i);
            i++;
            int count=1;
            while(i<s.length() && s.charAt(i)==c)
            {
                i++;
                count++;
            }
            
            res=Math.max(res,count);
        }
        
        return res;
    }
}