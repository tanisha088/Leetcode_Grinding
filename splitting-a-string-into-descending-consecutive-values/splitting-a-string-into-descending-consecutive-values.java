class Solution {
    public boolean splitString(String s) {
        
       return fn(s,-1,0,0);
    }
    
    public boolean fn(String s,long prev,int ind,int size)
    {
               
        if(ind==s.length() && size>=2)
        {
      
            return true;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=ind;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            int st=0;
            
            while(st<sb.length() && sb.charAt(st)=='0')
                st++;
            String k1 = sb.substring(st,sb.length());
            if(k1.length()>(s.length()/2)+2)
                continue;
            if(k1.length()==0)
                k1="0";
            long val = Long.parseLong(k1);
        
            if(prev-val==1  || prev==-1)
            {
                boolean  b = fn(s,val,i+1,size+1);
                
                if(b)
                    return true;
            }
        }
        
        return false;
    }
}