class Solution {
    public int coinChange(int[] coins, int amount) {
        /*
        int[] dp= new int[amount+1];
        for(int i=1;i<dp.length;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i && dp[i-coins[j]]!=Integer.MAX_VALUE)
                dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
                   
        return (dp[amount]==Integer.MAX_VALUE?-1:dp[amount]);
        */
        
  //  *****USING NEW TECHNIQUE JO YOUTUBE SE SEEKHI******//    
    
        /*
        int[][] dp= new int[coins.length+1][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE-1);
            dp[i][0]=0;
        }
    
        
        
        for(int i=1;i<=coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j-coins[i-1]>=0)
                dp[i][j]= Math.min(1+dp[i][j-coins[i-1]],dp[i][j]);
            }
        }
        
        return dp[coins.length][amount]==Integer.MAX_VALUE-1?-1:dp[coins.length][amount];
        */
        
        
        //*** SAME YOUTUBE TECHNIQUE WITH ONE ARRAY ***//
        
        /*
        int[] dp= new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
         for(int i=1;i<=coins.length;i++)
            for(int j=1;j<=amount;j++)
                if(j-coins[i-1]>=0)
                dp[j]= Math.min(1+dp[j-coins[i-1]],dp[j]);
        
        
        return dp[amount]==Integer.MAX_VALUE-1?-1:dp[amount];
        */
        
        
        // IT IS IMPOSSIBLE TO ACHIEVE A VALUE SUM >0 IF WE HAVE ZERO ELEMENTS
        // AND HENCE RES[I] IF I!=0 INITIALLY IS MAX REPRESENTING -1 -> MEANING 
        // NOT POSSIBLE TO HAPPEN , BUT IF WE HAVE NO ELEMENTS , WE STILL CAN HAVE 
        // ZERO SUM ---> USING 0 COINS. SO IT IS POSSIBLE AND AFTER THAT 
        // EACH TIME WE WILL BE TAKING RES[J] = 1+ RES[J-ARR[I-1]] IF J-ARR[I-1] IS
        // POSSIBLE TO HAPPEN SINCE , AGAR J-ARR[I-1] ISNN'T POSSIBLE TO HAPPEN
        // HOW COME ANYTHING ADDED TO IT IS POSSIBLE.
        
//         int[] res =new int[amount+1];
//         // res[0]=0;
// //         for(int i=1;i<res.length;i++)
// //             res[i]=Integer.MAX_VALUE;
        
//         if(amount==0)
//             return 0;
        
//         for(int i=1;i<coins.length+1;i++)
//         {
//                if(coins[i-1]==amount)
//                     return 1;
           
//             for(int j=1;j<amount+1;j++)
//             {
//                 if(coins[i-1]>j || (j!=coins[i-1] && res[j-coins[i-1]]==0))
//                     continue;
                
             
                
//               //  if(res[i-coins[j]]!=Integer.MAX_VALUE)
              
//                 if(res[j]==0)
//                      res[j]=Integer.MAX_VALUE;
//                res[j] = Math.min(res[j],res[j-coins[i-1]]+1);
//             }
            
//        //     res[i]=max;
//         }
        
        
//         return res[res.length-1]==0?-1:res[res.length-1];
        
        
        
        
        /*
        
        
        1,2,5
        
        */
        
           int[] arr = new int[amount+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        // if(amount==0)
        //     return 0;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=1;j<=amount;j++)
            {
//                 if(j==coins[i])
//                 {
//                     arr[j]=1;
//                     continue;
//                 }
                
                 if(j>=coins[i])
                 {
                     if(arr[j-coins[i]]==Integer.MAX_VALUE)
                          continue;
                     arr[j]=Math.min(arr[j],arr[j-coins[i]]+1);
                 }
          
            }
            
       //     for(int j=0;j<=amount;j++)
         //       System.out.print(arr[j]+"   ");
     //       System.out.println();
        }
        
        return arr[arr.length-1]==Integer.MAX_VALUE?-1:arr[arr.length-1];
       
    }
        
}
    
    
    



// coins.length * amount 


// j >= arr[i-1] 

// mat[i][j] = mat[i-1][j]

// if(mat[i][j]==0 ?  MAX)

// max(mat[i][j]arr[i-1][j-arr[i-1]]+1















    
    