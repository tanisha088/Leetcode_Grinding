class Solution {
    public int maximalRectangle(char[][] matrix) {
        
      /*
      1 0 1 0 0
      2 0 2 1 1
      3 1 3 2 2
      4 0 0 3 0
      */
            
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='0')
                    continue;
                matrix[i][j]=(char)(matrix[i-1][j]-'0'+matrix[i][j]);
            }
        }
        int ans =0;
        
       for(int i=0;i<matrix.length;i++)
        {
         //   for(int j=0;j<matrix[i].length;j++)
           //     System.out.println(matrix[i][j]);
            
            int area =  max_rec(matrix[i]);
            
     //    System.out.println(area+"******");
            ans = Math.max(area,ans);
            
      //      System.out.println("****");
        }
        
     //   System.out.println(matrix[2]);
      //  System.out.println(max_rec(matrix[2]));
        
        return ans;
    }
    
    public int max_rec(char[] heights)
    {
        /*
        Stack<Integer> st = new Stack<Integer>();
        int area = 0;
        for(int i=0;i<matrix.length;i++)
        {
            
            if(st.isEmpty())
                st.add(i);
            else
            {
                while(!st.isEmpty() && matrix[i]<matrix[st.peek()])
                {
                    
                int j1 = st.pop();
                    if(matrix[i]==matrix[j1])
                        continue;
                    int m =  st.isEmpty() ? -1 : st.peek();
                    
                   
                area = Math.max((i-m-1)*(matrix[j1]-'0'),area);
                    
                 System.out.println(i+" "+m+" "+j1+" "+area);

                }
             st.push(i);
                
            }
        }
        
        while(!st.isEmpty())
            {
            int j1 = st.pop();
            int k2 = st.isEmpty()?-1:st.peek();
                 area = Math.max((matrix.length-k2)*(matrix[j1]-'0'),area);
                         System.out.println(j1+" **"+ k2+" "+matrix.length+" "+area);

            }
        
        
        return area;
        */
         int len = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= len;) {
            int h = (i == len ? 0 : heights[i]-'0');
            if (stack.isEmpty() || h >= heights[stack.peek()]-'0') {
                stack.push(i);
                i++;
            }else {
                int curHeight = heights[stack.pop()]-'0';
                int rightBoundary = i - 1;
                int leftBoundary = stack.isEmpty() ? 0 : stack.peek() + 1;
                int width = rightBoundary - leftBoundary + 1;
                maxArea = Math.max(maxArea, (curHeight * width));
            }
        }
        return maxArea;
 //   }
    
    }
}

// 3 1 3 2 2 

//r-l-1 
    
//arr.length+1-l-1



    
