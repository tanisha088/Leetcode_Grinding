class Solution {
    public int titleToNumber(String columnTitle) {
        int tot = 0;
        int pow = 1;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            char c  = columnTitle.charAt(i);
            tot = pow*(c-'A'+1) + tot;
            pow = pow * 26;
        }
        
        return tot;
    }
}


