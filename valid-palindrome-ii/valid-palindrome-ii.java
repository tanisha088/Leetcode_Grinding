class Solution {
    public boolean validPalindrome(String s) {
        
        char[] ar = s.toCharArray();
        
       if( ispal(ar,-1) )
           return true;
        
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            if(ar[i]!=ar[j])
            {
                if(ispal(ar,i) || ispal(ar,j))
                    return true;
                
                return false;
            }
            else 
            {
                i++;
                j--;
            }
        }
        
        return false;
    }
    
    public boolean ispal(char[] arr ,int ig)
    {
        int i=0;
        int j=arr.length-1;
        
        while(i<j)
        {
            if(i==ig)
                i++;
            else if(j==ig)
                j--;
            else
            {
                if(arr[i]!=arr[j])
                    return false;
                
                i++;
                j--;
            }
        }
        
        return true;
    }
}

