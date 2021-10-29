class Solution {
    public int minSwaps(String s) {
       
        int len= s.length();
        String a1= "";
        String a2 ="";
        int ones=0;
        int twos=0;
        int i=0;
        boolean one=true;
        while(a1.length()<len)
        {
            if(one)
            {
            a1 =a1 + "1";
                if(s.charAt(i)=='0')
                    ones++;
            }
            else
            {
                a1=a1+"0";
                if(s.charAt(i)=='1')
                    twos++;
            }
            one=!one;
            
            i++;
            
        }
        
         one=true;
         i=0;
        
        int ansa=Integer.MAX_VALUE;
        if(ones==twos)
            ansa=Math.min(ones,ansa);
        
        ones=0;
        twos=0;
        
        
        
        while(a2.length()<len)
        {
            if(one)
            {
            a2 =a2 + "0";
                 if(s.charAt(i)=='1')
                    twos++;
            }
            else
            {
                a2=a2+"1";
                 if(s.charAt(i)=='0')
                    ones++;
            }
            one=!one;
            i++;
        }
        
        if(ones==twos)
        ansa=Math.min(ansa,ones);
        
        if(ansa==Integer.MAX_VALUE)
            return -1;
      return ansa;
    }
}




    