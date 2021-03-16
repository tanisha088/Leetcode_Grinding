class Solution {
    public String orderlyQueue(String S, int K) {
      
        char[] arr= S.toCharArray();
          if(K==1)
          {
             String res= S;
            for(int i=0;i<S.length();i++)
            {
                String m = S.substring(1,S.length())+S.substring(0,1);
                                System.out.println(res+" "+S+" "+m);

                if(m.compareTo(res)<0)
                    res=m;
                S=m;
            }
              
              return res;
          }
        else
        {
            Arrays.sort(arr);
        }
        
        
        return new String(arr);
    }
}