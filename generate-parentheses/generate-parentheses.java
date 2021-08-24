class Solution {
    public List<String> generateParenthesis(int n) {
         
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<n;i++)
            sb.append('(');
        
        for(int i=0;i<n;i++)
            sb.append(')');
        
        int open=0;
        int closed =0;
        
        HashSet<String> set = new HashSet();
        
        List<String> list = new ArrayList<String>();
        
        fn(list,
"()",set,open,closed,new StringBuilder(""),new HashSet<Integer>(),n);
        
        return list;
    }
    
    public void fn(List<String> res,String str,HashSet<String> set,int op,int cl,StringBuilder ans,HashSet<Integer> indices,int n)
    {
     //   System.out.println(res+" "+ans+" "+indices);
        
        if(ans.length()==str.length()*n && !set.contains(ans.toString()))
        {
            set.add(ans.toString());
            res.add(ans.toString());
            
            return;
        }
        
        
        for(int i=0;i<str.length();i++)
        {
         //   if(indices.contains(i))
           //     continue;
            if((str.charAt(i)==')' && op==cl) || (str.charAt(i)=='(' && op==n))
                continue;
            
            ans.append(str.charAt(i));
         //   indices.add(i);
            int ncol=cl;
            int nop=op;
            
            if(str.charAt(i)==')')
                 ncol++;
            else
                nop++;
                
      //      System.out.println(ncol+" "+nop+" "+indices+" "+ans+"***");
            fn(res,str,set,nop,ncol,ans,indices,n);
            
            ans.delete(ans.length()-1,ans.length());
       //     indices.remove(i);
        }
    }
}









/*

[,",",","",

[,",",,","(())(()),"",",",""]














2 -  ()() (()) 0,0

(())   

  3,3
  
  oooccc
  
 
  











*/