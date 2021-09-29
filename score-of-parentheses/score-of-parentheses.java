class Solution {
    
  
    
    public int scoreOfParentheses(String s) {
     
//         Stack<String> st =new Stack<String>();
        
//         for(int i=0;i<s.length();i++)
//         {
//             char c = s.charAt(i);
            
//             if(c=='(')
//                 st.push(c+"");
//             else
//             {
//                 if(st.peek().equals("("))
//                 {
//                     st.pop();
                  
//                     if(!st.isEmpty() && !st.peek().equals("("))
//                     {
//                       st.push((Integer.parseInt(st.pop())+1) + "");
//                     }
//                     else
//                         st.push(1+"");
//                 }
//                 else
//                 {
//                     int m = Integer.parseInt(st.pop());
//                     st.pop();
                   
//                     if(!st.isEmpty() && !st.peek().equals("("))
//                     {
//                       st.push((Integer.parseInt(st.pop())+2*m) + "");
//                     }
//                     else
//                          st.push(2*m+"");
//                 }
//             }
//         }
        
//         return Integer.parseInt(st.peek());
        
        
//           int res[] = new int[30], i = 0;
//         for (char c : s.toCharArray())
//         {
//             if (c == '(') res[++i] = 0;
//             else res[i - 1] += Math.max(res[i--] * 2, 1);
                    
//             for(int j=0;j<res.length;j++)
//                 System.out.print(res[j]+" ");
//             System.out.println();
//         }
//         return res[0];
        
        
        Stack<int[]>  st = new Stack<int[]>();
        
        st.push(new int[]{-1,0});
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || st.peek()[0]==-1 || s.charAt(st.peek()[0])==')')
                st.push(new int[]{i,0});
            else 
            {
                int[] m = st.pop();
                int ans=(m[1]==0?1:2*m[1]);
                
                int[] m1 =  st.peek();
                m1[1] += ans; 
            }
        }
        
        
        return st.pop()[1];
        
    }
}
/*

(()())(())
score -> 4+2 = 6     4    
*/













/*





(( () (()) ))   









*/


















