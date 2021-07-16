class Solution {
    public String countOfAtoms(String formula) {
        
//         Map<String,Integer> h = new TreeMap<String,Integer>();
//         int i=formula.length()-1;
//         int mul=1;
//         Stack<Integer> st= new Stack<Integer>();
//         while(i>=0)
//         {
            
//             if(formula.charAt(i)=='(')
//             {
//                  mul/=st.pop();
//                 i--;
//                 continue;
//             }
            
            
            
//             String num="";
            
          
//                 while(Character.isDigit(formula.charAt(i)))
//                     num=formula.charAt(i--)+num;
            
//             if(num.length()==0)
//                 num="1";
            
//             int j = Integer.parseInt(num);
            
//             mul*=j;
                  
//             st.push(j);
            
//             String a1="";
            
//             if(formula.charAt(i)==')')
//             {
//                 i--;
//                  continue;
//             }
            
//             while(i>=0 && Character.isLetter(formula.charAt(i)))
//             {
//                 a1=formula.charAt(i)+a1;
//                 if(Character.isUpperCase(formula.charAt(i--)))
//                     break;
//             }
            
//             if(a1.length()>0)
//             {
//                 int q1 = h.getOrDefault(a1,0)+mul;
//                 h.put(a1,q1);
//                 mul=mul/st.pop();
//             }
            
            
            
             
//         }
        
//         String res="";
//         for(Map.Entry<String,Integer> e:h.entrySet())
//         {
//         res=res+e.getKey();
//             if(e.getValue()>1)
//                 res+=Integer.toString(e.getValue());
//         }
//         System.out.println(h);
//         return res;
        
         Map<String,Integer> h = new TreeMap<String,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        int[] arr = new int[formula.length()];
        Arrays.fill(arr,1);
        for(int i=0;i<formula.length();i++)
        {
            char m = formula.charAt(i);
            
            if(m=='(')
                st.push(i);
            else if(m==')')
            {
                if(i<formula.length()-1 && (formula.charAt(i+1)-'0'>=1 && formula.charAt(i+1)-'0'<=9))
                {
                    int j = i;
                    i=i+1;
                    String ans= "";
                    while(i<formula.length() && Character.isDigit(formula.charAt(i)))
                        ans = ans + formula.charAt(i++);
                    
                   int in =  st.pop();
                    if(ans.length()==0)
                        arr[in]=1;
                    else
                    arr[in]=Integer.parseInt(ans);
                    arr[j] = arr[in];
                    i--;
                }
                   else
                   {
                       arr[st.pop()]=1;
                       
                   }
                
        }   
    }
        
     
        int mul=1;
        for(int i=0;i<arr.length;)
        {
            if(formula.charAt(i)=='(')
                mul=mul*arr[i++];
            else if(formula.charAt(i)==')')
                mul = mul/arr[i++];
            else 
            {
                if(Character.isDigit(formula.charAt(i)))
                {
                    i++;
                    continue;
                }
                    String name =""+ formula.charAt(i);
                i++;
                while(i<formula.length() && Character.isLetter(formula.charAt(i)) &&Character.isLowerCase(formula.charAt(i)))
                {
                    name = name +formula.charAt(i);
                   i++;
                }
                String k1 = "";
                while(i<formula.length() && Character.isDigit(formula.charAt(i)))
                    k1 = k1 + formula.charAt(i++);
                
                int val=1;
                if(k1.length()!=0)
                    val =Integer.parseInt(k1);
                
                h.put(name,h.getOrDefault(name,0)+val*mul);
            }
        }
        
        
                String res="";
        for(Map.Entry<String,Integer> e:h.entrySet())
        {
        res=res+e.getKey();
            if(e.getValue()>1)
                res+=Integer.toString(e.getValue());
        }
      //  System.out.println(h);
        return res;
        
}

}
















/// K4(ON(SO3)2 (NM)3 )2 -> 
//       2 2      3  







