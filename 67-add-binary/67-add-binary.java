class Solution {
    public String addBinary(String a, String b) {
        
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb =  new StringBuilder("");
        int carry = 0;
        
        while(i>=0 && j>=0)
        {
            char c1= a.charAt(i);
            char c2= b.charAt(j);
            char ans = '0';
            if(c1==c2)
            {
                if(c1=='0' && c2=='0')
                {
                    if(carry==1)
                        ans= '1';
                    carry=0;
                }
                else
                {
                    if(carry==1)
                        ans='1';
                    carry=1;
                }
               
            }
            else
            {
                if(carry==0)
                    ans='1';
            }
            
            sb.append(ans);
            
            i--;
            j--;
            
   //         System.out.println(i+" "+j+" "+sb);
        }
        
       
        if(j>=0)
        {
            a=b;
            i=j;
        }
     //    System.out.println(sb+" "+carry+" "+i+" "+a);
        while(i>=0)
        {
            char c  = '0';
            if((a.charAt(i)=='0' && carry==1) || (a.charAt(i)=='1' && carry==0))
            {
                c = '1';
               
            }
          
            if(a.charAt(i)=='1' && carry==1)
                carry=1;
            else 
                   carry=0;
            sb.append(c);
            i--;
        }
        
       //   System.out.println(sb+" "+carry);
        
        if(carry==1)
            sb.append('1');
        return sb.reverse().toString();
    }
}

