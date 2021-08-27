class Solution {
    public int maximalRectangle(char[][] matrix) {
    
            
//         for(int i=1;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]=='0')
//                     continue;
//                 matrix[i][j]=(char)(matrix[i-1][j]-'0'+matrix[i][j]);
//             }
//         }
//         int ans =0;
        
//        for(int i=0;i<matrix.length;i++)
//         {
//            int area =  max_rec(matrix[i]);
//            ans = Math.max(area,ans);
//         }
//         return ans;
//     }
    
//     public int max_rec(char[] matrix)
//     {
    
//         Stack<Integer> st = new Stack<Integer>();
//         int area = 0;
//         for(int i=0;i<matrix.length;i++)
//         {
            
//             if(st.isEmpty())
//                 st.add(i);
//             else
//             {
//                 while(!st.isEmpty() && matrix[i]<matrix[st.peek()])
//                 {
//                 int j1 = st.pop();
//                     int m =  st.isEmpty() ? -1 : st.peek();
//                 area = Math.max((i-m-1)*(matrix[j1]-'0'),area);
//                 }
//              st.push(i);
//                  }
//         }
        
//         while(!st.isEmpty())
//             {
//             int j1 = st.pop();
//             int k2 = st.isEmpty()?-1:st.peek();
//                  area = Math.max((matrix.length-1-k2-1+1)*(matrix[j1]-'0'),area);
//              }  
//         return area;
 
        
//         /*
//          int len = heights.length;
//         int maxArea = 0;
//         Stack<Integer> stack = new Stack<>();
//         for (int i = 0; i <=len;) {
//             int h = (i == len ? 0 : heights[i]-'0');     
//             if (stack.isEmpty() || h >= heights[stack.peek()]-'0') {
//                 stack.push(i);
//                 i++;
//             }else {
//                 int curHeight = heights[stack.pop()]-'0';
//                 int rightBoundary = i - 1;
//                 int leftBoundary = stack.isEmpty() ? 0 : stack.peek() + 1;
//                 int width = rightBoundary - leftBoundary + 1;
//                 maxArea = Math.max(maxArea, (curHeight * width));
                
//             }
            
//             System.out.println(stack);
//         }
//         return maxArea;
//  //   }
//  */
        
        
          if(matrix.length==0 || matrix[0].length==0)
              return 0;
        int[][] mat =new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]  = matrix[i][j]-'0';
            }
        }
        int max=fn(mat[0]);
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(mat[i][j]==0)
                    continue;
                
                mat[i][j] = mat[i-1][j] + 1;
            }
            
            max=Math.max(max,fn(mat[i]));
        }
        
        return max;
    }
    
    public static int fn(int[] mat)
    {
        Stack<Integer> st = new Stack<Integer>();
        int costs =0;
        for(int i=0;i<mat.length;i++)
        {
          //  System.out.println(st+" "+i+" "+mat[i]);
            while(!st.isEmpty() && mat[st.peek()]>=mat[i]){
                
                int j = st.pop();
                int l = -1;
                if(!st.isEmpty())
                    l= st.peek();
                costs = Math.max((i-l-1)*mat[j],costs);
                System.out.println(costs);
            }
            
            st.push(i);
        }
   //     System.out.println(st);
        while(!st.isEmpty())
        {
            int r = mat.length;
            int m = st.pop();
            int l = (st.isEmpty())?-1:st.peek();
            costs = Math.max((r-l-1)*mat[m],costs);
     //       System.out.println(costs+"****");
        }
        return costs;
    }
}

// r-l-1 * arr[i]

// r-l-1  = ?  = 2
// arr.length +1 -1 = 3 
    
//     1 3 - - 

  // 7 
//    3 5 
       

// r-l-1 
    
//     1-(-1)-1 = 1
/*

31322

[0]
[1]
[1, 2]
[1, 3]
[1, 3, 4]
[1, 3, 5]
*/

/*
[0]
[]
[1]
[1, 2]
[1]
[1, 3]
[1, 3, 4]
[1, 3]
[1]
[]
[5]
*/


// 3 1 3 2 2

// 3

//r-l-1 
    
//arr.length+1-l-1



    
