class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> list=  new ArrayList();
        fn(list,n,0,0,"");
   //     System.out.println(list);
        return list;
    }
    
    public void fn(ArrayList<String> list,int n,int open,int closed,String sb)
    {
        if(open+closed==n*2)
        {
            list.add(new String(sb));
            return;
        }
        
        if(open<n)
            fn(list,n,open+1,closed,sb+"(");
        
        if(open>closed )
            fn(list,n,open,closed+1,sb+")");
    }
        
         
//         StringBuilder sb = new StringBuilder("");
        
//         for(int i=0;i<n;i++)
//             sb.append('(');
        
//         for(int i=0;i<n;i++)
//             sb.append(')');
        
//         int open=0;
//         int closed =0;
        
//         HashSet<String> set = new HashSet();
        
//         List<String> list = new ArrayList<String>();
        
//         fn(list,
// "()",set,open,closed,new StringBuilder(""),new HashSet<Integer>(),n);
        
//         return list;
//     }
    
//     public void fn(List<String> res,String str,HashSet<String> set,int op,int cl,StringBuilder ans,HashSet<Integer> indices,int n)
//     {
//         if(ans.length()==str.length()*n )
//         {
            
//             res.add(ans.toString());
            
//             return;
//         }
           
//         for(int i=0;i<str.length();i++)
//         {
         
//             if((str.charAt(i)==')' && op==cl) || (str.charAt(i)=='(' && op==n))
//                 continue;
            
//             ans.append(str.charAt(i));

//             int ncol=cl;
//             int nop=op;
            
//             if(str.charAt(i)==')')
//                  ncol++;
//             else
//                 nop++;
                
//             fn(res,str,set,nop,ncol,ans,indices,n);
            
//             ans.delete(ans.length()-1,ans.length());

//         }
   //   }  
}









/*

[,",",","",

[,",",,","(())(()),"",",",""]





(()(







open==count 


*/