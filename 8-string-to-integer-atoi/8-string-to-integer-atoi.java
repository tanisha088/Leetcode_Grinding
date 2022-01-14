class Solution {
    public int myAtoi(String s) {
      
        int i=0;
        boolean pos = true;
       // System.out.println(s.charAt(0)+" "+" "+(int)'0'+" "+(s.charAt(i)<(int)'0'));
        while(i<s.length() && (s.charAt(i)==' ' || s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='+')
            {
                pos=true;
                i++;
                break;
            }
            if(s.charAt(i)=='-')
            {
                pos=false;
                i++;
                break;
            }
            i++;
        }
       
              
        while(i<s.length() && s.charAt(i)=='0')
            i++;
        
        long ans = 0;
        boolean isexcess=false;
        
  //      System.out.println(ans+" "+i);
        
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            ans =ans*10 + (s.charAt(i)-'0');
            if(pos==false && (0-ans)<=Integer.MIN_VALUE)
                isexcess=true;
            
            if(pos==true && ans>=Integer.MAX_VALUE)
                isexcess=true;
            
            if(isexcess)
                break;
            i++;
        }
        
      //  System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        
        if(isexcess)
            return (pos==false)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        
        return (pos==false)?(int)(0-ans):(int)ans;
        
    }
}



// ignore whitespace 
//  see sign -  then read the number  