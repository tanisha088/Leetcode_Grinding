class Solution {
    public boolean isSubsequence(String s, String t) {
        int i= 0;
        int j =0;
        
        while(i<s.length() && j<t.length())
        {
            
            char  c = s.charAt(i);
            
            while(j<t.length() && t.charAt(j)!=c)
                j++;
            
            if(j<t.length() && t.charAt(j)==c)
            {
                i++;
                j++;
            }
        }
        
        return i==s.length()?true:false;
    }
}