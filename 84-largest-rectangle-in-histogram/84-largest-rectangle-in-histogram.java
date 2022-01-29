class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> st=  new Stack<Integer>();
        int ans = 0;
        
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                int a = st.pop();
                int b = i;
                if(!st.isEmpty())
                    b=i-st.peek()-1;
                
                ans = Math.max(ans,heights[a]*b);
                
            }
            
            st.push(i);
        }
        
        while(!st.isEmpty())
        {
            int a = st.pop();
            int c = heights.length;
            if(!st.isEmpty())
                c= c-st.peek()-1;

            
            ans =Math.max(ans,heights[a]*c);
        }
        
        return ans;
        

// //         int[] sol = new int[heights.length];
// //         int[] sor = new int[heights.length];
        
// //         Stack<Integer> st = new Stack<Integer>();
// //         for(int i=0;i<heights.length;i++)
// //         {
// //             while(!st.isEmpty() && heights[st.peek()]>=heights[i])
// //                 st.pop();
            
// //             if(st.isEmpty())
// //                 sol[i]=-1;
// //             else
// //                 sol[i]=st.peek();
            
// //             st.push(i);
// //         }
        
// //         st = new Stack<Integer>();
// //         for(int i=heights.length-1;i>=0;i--)
// //         {
// //             while(!st.isEmpty() && heights[st.peek()]>=heights[i])
// //                 st.pop();
            
// //             if(st.isEmpty())
// //                 sor[i]=-1;
// //             else
// //                 sor[i]=st.peek();
            
// //             st.push(i);
// //         }
         
// //   //   -1 -1
        
        
// //         int ans=0;
        
// //         /*
// //         for(int i=0;i<heights.length;i++)
// //         {
// //             int val=0;
            
// //             // ALL THESE CONDITIONS CAN BE REDUCED TO JUST ---->
            
// //             // (SOR[I]-SOL[I]-1)*(HEIGHTS[I]) IF WE PUT SOR[I]=HEIGHTS.LENGTH WHEN IT IS -1 AND SOL[I]=-1 WHEN IT IS -1
// //             /*
// //             if(sol[i]==-1 && sor[i]==-1)
// //                 val=heights.length*heights[i];
// //             else if(sol[i]==-1)
// //                 val=sor[i]*heights[i];
// //             else if(sor[i]==-1)
// //                 val=(heights.length-1-sol[i])*heights[i];
// //             else 
// //                 val=(sor[i]-sol[i]-1)*(heights[i]);
            
            
// //             ans = Math.max(val,ans);
// //         //    System.out.println(sol[i]+" "+sor[i]);
// //         }
// //         */
        
// //         for(int i=0;i<sor.length;i++)
// //             sor[i]= (sor[i]==-1)?heights.length:sor[i];
        
// //         for(int i=0;i<sol.length;i++)
// //             ans=Math.max(ans,(sor[i]-sol[i]-1)*(heights[i]));
        
// //         return ans;
        
        
//         Stack<Integer> st = new Stack<Integer>();
//         int ans=0;
        
//         /*
//         >=
//         pop -     jo nikal rha hai -  jo neeche hai -1
//         if neeche nothing  ->  jo neeche hai = -1
//         if upar nothing  ->   arr.length
//         */
        
        
//         for(int i=0;i<heights.length;i++)
//         {
//             while(!st.isEmpty() && heights[st.peek()]>=heights[i])
//             {
//                 int m =  st.pop();
//                 int low =  (st.isEmpty())?-1:st.peek();
//                 int high =  i;
                
//                 ans= Math.max(ans,(high-low-1)*heights[m]);
//             }
            
//             st.push(i);
//         }
        
//         while(!st.isEmpty())
//         {
//                 int m =  st.pop();
//                 int low =  (st.isEmpty())?-1:st.peek();
//                 int high = heights.length;
                
//                 ans= Math.max(ans,(high-low-1)*heights[m]);
//         }
        
//         return ans;
        
    }
}


//a b c d e f

//f-b+1
    
    
  //  -b+arr.length-1


//  2 1 5 6 2 3  

// 1 2 3 2 1 2 2      








