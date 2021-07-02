class Solution {
    public boolean validPalindrome(String s) {
        return  vP1(s,1);
    }
    
    public boolean vP1(String s,int cap)
    {
           char[] ar = s.toCharArray();
        
        if(cap<0)
            return false;
        
       if( ispal(ar,-1))
       {
     //      System.out.println(s+" " +ispal(ar,-1));   
           return true;
       }
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            if(ar[i]!=ar[j])
            {
                  
                if(vP1(s.substring(i+1,j+1),cap-1) || vP1(s.substring(i,j),cap-1))                     return true;
                
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
        
        
        /*
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
    */
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

