class Solution {
    public int brokenCalc(int X, int Y) {
        
        if(X==Y)
            return 0;
        
     int ans=0;
         if(Y%2!=0)
         {
             Y+=1;
             ans+=1;
         }
      
        while(Y>X)
        {
            if(Y%2!=0)
            {
                Y+=1;
                ans+=1;
            }
            Y=Y/2;
         //     System.out.println(X+" "+Y);
            ans+=1;
        }
        
        return ans + X-Y;
        
    }

   
    
}


  