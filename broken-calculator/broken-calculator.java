class Solution {
    public int brokenCalc(int X, int Y) {
        
        int res=0;
        
        
        
        while(Y>X)
        {
            if(Y%2!=0)
        {
            res+=1;
            Y+=1;
        }
            if(Y<=X)
                break;
            res+=1;
            Y/=2;
            
        }
        
        return res+Math.abs(X-Y);
           
    }

   
    
}


  










//  target- even -  divide by 2  >> start , find out diff 


// --- , * 
    
//     3-1*2*2


