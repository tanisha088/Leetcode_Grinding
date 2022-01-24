class Solution {
    public boolean detectCapitalUse(String word) {
        int caps =  0;
        boolean iscap = false;
        int i=0;
        
        for(char c:word.toCharArray())
        {
            if(c>='A' && c<='Z')
            {
                caps++;
             if(i==0)
                 iscap=true;
            }
            
               i++;
            
        }
        
        if(caps==0 || caps==word.length() || (caps==1 && iscap))
            return true;
        
        return false;
    }
}