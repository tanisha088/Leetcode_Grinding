class Solution {
    public String maxValue(String n, int x) {
        int req=0;
        char character = n.charAt(0);
        
        StringBuilder sb = new StringBuilder(n);
        if(character=='-')
        {
            req=-1;
            sb = new StringBuilder(n.substring(1,n.length()));
            for(int i=0;i<sb.length();i++)
                if((sb.charAt(i)-'0')>x)
                {
                   sb.insert(i,(char)(x+'0'));
                    return "-"+sb.toString();
                }
        
        }
        else
        {
            for(int i=0;i<n.length();i++)
                if((sb.charAt(i)-'0')<x)
                {
                   sb.insert(i,(char)(x+'0'));
                    return sb.toString();
                }
        
        }
   //     System.out.println(sb);
        
        String q =  sb.append((char)(x+'0')+"").toString();
        
        if(req==-1)
            q="-"+q;
        
        return q;
        
//         if(req_in==-1)
//             return (n+(char)(x+'0'));
      
//         return n.substring(0,req_in)+(char)(x+'0')+n.substring(req_in,n.length());
        
    }
}