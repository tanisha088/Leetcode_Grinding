class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     
        HashSet<String> set = new HashSet(wordDict);
        int[] mat = new int[s.length()];
        return fn(s,set,0,mat);
    }
    
    public boolean fn(String s,HashSet<String> set,int i,int[] mat)
    {
          if(i==s.length())
           {  return true;}
        
        
        if(mat[i]!=0)
            return mat[i]==-1?false:true;
        
      
       StringBuilder sb = new StringBuilder("");
        
        for(int q=i;q<s.length();q++)
        {
            sb.append(s.charAt(q));
            if(set.contains(sb.toString()))
            {
                boolean b = fn(s,set,q+1,mat);
//                System.out.println(sb+" "+b);
                if(b)
                              { mat[i] = 1;  return true;}
            }
        }
        
        mat[i]=-1;
        return false;
    }
}


/*


check if s.length()==0 -> yes return true

leet leetcode


leetcodeleet




*/