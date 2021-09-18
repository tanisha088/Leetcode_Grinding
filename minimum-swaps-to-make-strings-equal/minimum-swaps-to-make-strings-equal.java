class Solution {
    public int minimumSwap(String s1, String s2) {
        
        int v1=0;
        int v2=0;
        
        for(int i=0;i<s1.length();i++)
        {
            char a1 = s1.charAt(i);
            char a2 = s2.charAt(i);
            
            if(a1=='x' && a2=='y')
                 v1++;
            else if(a1=='y' && a2=='x')
                v2++;
        }
        
        if(v1%2!=0 && v2%2==0)
            return -1;
        
        if(v1%2==0 && v2%2!=0)
            return -1;
        
        return v1/2 + v2/2  + ((v1%2!=0)?2:0); 
    }
}

// equal - leave

// 1,0  +1
// 0,1  -1
   


    
// 110011
// 100110
    

// 110010
// 001101
    
    
//     1,0 + 0,1 ->even - odd- returnn -1
//     1,0 and 0,1  both odd -  return -1
    

    
    