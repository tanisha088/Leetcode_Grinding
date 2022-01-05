class Solution {
    public List<List<String>> partition(String s) {
        
        boolean[][] palind  = new boolean[s.length()][s.length()];
        
        for(int gap=0;gap<s.length();gap++)
        {
            for(int i=0;i<s.length();i++)
            {
                int  j = i + gap;
                
                if(j>=s.length())
                    continue;
                
                if(gap==0)
                    palind[i][j]=true;
                
                else if(gap==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                          palind[i][j]=true;
                    
                }
                
                else
                {
                    if(i<s.length()-1 && j>0 && palind[i+1][j-1] && s.charAt(i)==s.charAt(j))
                         palind[i][j]=true;
                }
                
                
            }
        }
        
    List<List<String>> ans = new ArrayList();
        
        fn(ans,palind,0,s,new ArrayList<String>());
        return ans;
    }
    
    public void fn(List<List<String>> ans,boolean[][] palind,int i,String str,List<String> ll)
    {
        
        if(i>str.length())
            return;
        
        if(i==str.length())
        {
            ans.add(new ArrayList(ll));
            return;
        }
        
       for(int st=i;st<str.length();st++)
       {
      //   System.out.println(i+" "+st+" "+palind[i][st]);
           if(palind[i][st]==true)
           {
               ll.add(str.substring(i,st+1));
               fn(ans,palind,st+1,str,ll);
               ll.remove(ll.size()-1);
           }
       }
        
    }
}