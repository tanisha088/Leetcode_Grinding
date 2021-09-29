class Solution {
    public int maximumGain(String s, int x, int y) {
//         // stack approach 
//         Stack<Character> st = new Stack<Character>();
       
//         char f = 'a';
//         char s = 'b';
        
//         int max=x;
//         int min=y;
//         if(y>x)
//         {
//             f='b';
//             s='a';
//             max=y;
//             min=x;
//         }
//         int res=0;
        
//         for(char c:str.toCharArray())
//         {
//             if(!st.isEmpty() && st.peek()==f && c==s)
//             {
//                 st.pop();
//                 res+=max;
//             }
//             else
//                 st.push(c);
                
//         }
        
//         while(!st.isEmpty())
//         {
//             char m = st.pop();
//             if(!st.isEmpty() && st.peek()==s && m==f)
//             {
//                 st.pop();
//                 res+=min;
//             }
//         }
            
//         return res;
//         Stack<Character> stack = new Stack<>(), stack2 = new Stack<>();
// 	int result = 0, max=Math.max(x,y), min =Math.min(x,y);
// 	char first= (x>y)?'a':'b', second=(x>y)?'b':'a';
// 	for(char c: s.toCharArray()) 
// 		if(!stack.isEmpty() && stack.peek() == first && c == second) {
// 			stack.pop(); 
// 			result +=max;
// 		} else stack.push(c);
// 	while(!stack.isEmpty()) {
        
// 		char c = stack.pop();
// 		if(!stack2.isEmpty() && stack2.peek() == second && c == first) {
// 			stack2.pop(); 
// 			result +=min;
// 		} else stack2.push(c);
     
// 	}
// 	return result;
        
        
        
        char fir='a';
        char sec='b';
        
        if(y>x)
        {
            fir = 'b';
            sec = 'a';
        }
        
        int tot=0;
        Stack<Character> st1=  new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c!='a' && c!='b')
                {st1.push(c);continue;}
            
        //    System.out.println()
            
            if(st1.isEmpty() ||  c==fir || st1.peek()!=fir)
                st1.push(c);
            else
            {
                st1.pop();
                tot+=Math.max(x,y);
            }   
        }
        
        Stack<Character>st2 =  new Stack();
        
        while(!st1.isEmpty())
        {
            
            char m =  st1.pop();
            if(m!='a' && m!='b')
               { st2.push(m);
            continue;}
            if(st2.isEmpty() || m==fir || st2.peek()!=fir)
                st2.push(m);
            else 
            {
                st2.pop();
                tot+=Math.min(x,y);
            }
        }
        
        
        
        return tot;
     }
    
  
}



/*

abxbcaba




5+2+2
*/

















/*

bbaa

ba -->   



*/








