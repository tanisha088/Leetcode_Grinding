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
        Stack<Character> stack = new Stack<>(), stack2 = new Stack<>();
	int result = 0, max=Math.max(x,y), min =Math.min(x,y);
	char first= (x>y)?'a':'b', second=(x>y)?'b':'a';
	for(char c: s.toCharArray()) 
		if(!stack.isEmpty() && stack.peek() == first && c == second) {
			stack.pop(); 
			result +=max;
		} else stack.push(c);
	while(!stack.isEmpty()) {
        
		char c = stack.pop();
		if(!stack2.isEmpty() && stack2.peek() == first && c == second) {
			stack2.pop(); 
			result +=min;
		} else stack2.push(c);
     
	}
	return result;
    }
    
  
}


//  aaaaa
//  bb

// aaa
// bbb

// cdbcab