class Solution {
    
  //  List<String> result = new ArrayList();
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        
//         List<String> list = new ArrayList<String>();
        
         HashSet<String> set = new HashSet<String>(wordDict);
        return fn(s,set);
//         fn(s,list,set,new StringBuilder(""),0);
        
//         return list;
        
        
        
        
    }
    
    
    public List<String> fn(String s,HashSet<String> set)
    {
        List<String> res = new ArrayList();
        
        if(s.length()==0)
           { return res;}
        
        StringBuilder sb =  new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            if(set.contains(sb.toString()))
            {
                List<String> result =  fn(s.substring(i+1,s.length()),set);
                
                
                if(result.size()==0)
                  { if(i+1!=s.length())
                      continue; 
                   res.add(sb.toString());}
                else
                for(String str:result)
                {
                    res.add(sb.toString()+" "+str);
                }
                
            }
        }
        
        
        return res;
    }
    
 //   public  void fn(String s,List<String> list, HashSet<String>set , StringBuilder sb,int i)
   // {
//         if(i==s.length())
//         {
//        //         System.out.println(sb);
//             list.add(new String(sb.toString()));
//             return;
//         }
        
//         StringBuilder sb1 =  new StringBuilder("");
//         int q = sb.length();
//         for(int j=i;j<s.length();j++)
//         {
//             sb1.append(s.charAt(j));
//                      //       System.out.println(sb1+" "+sb+" ");

//             if(set.contains(sb1.toString()))
//             {
//                 if(sb.length()!=0)
//                     sb.append(" ");
//                 sb.append(sb1.toString());
//                 fn(s,list,set,sb,j+1);
//                 sb.delete(q,sb.length());
//             }
//         }
//    }
}

/*



*/
