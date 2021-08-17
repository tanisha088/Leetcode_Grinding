class Solution {
    
    int count=0;
    StringBuilder res;
    
    public String getPermutation(int n, int k) {
        
        count=0;
        res=new StringBuilder("");
        
        perm(n,k,new StringBuilder(""),new HashSet());
        
        return res.toString();
    }
    
    public void perm(int n,int k,StringBuilder val,HashSet<Integer> set)
    {
        if(count>k)
            return;
        
         if(count==k)
         {
             count++;
             res = new StringBuilder(val);
             return;
         }
        
        for(int i=1;i<=n;i++)
        {
            if(set.contains(i))
                continue;
            
           val.append(i+"");
         
            set.add(i);
            
            if(val.length()==n)
            count++;
            
            perm(n,k,val,set);
            
            val.delete(val.length()-1,val.length());
            
            set.remove(i);
        }
    }
}