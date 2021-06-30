class Solution {
    public String multiply(String num1, String num2) {
      
        /*
         1 2 3
        x4 5 6
             
          7 3 8
        6 1 5 x
      4 9 2 x x       
          */   
             String str = "";
             
             for(int i=num2.length()-1;i>=0;i--)
             {
                 int carr=0;
                 String s1 = "";
                 for(int j=num1.length()-1;j>=0;j--)
                 {
                    int prod = (num1.charAt(j)-'0')*(num2.charAt(i)-'0');
                     int nprod = (prod+carr)%10;
                     s1 = (char)(nprod+'0')+s1;
                     carr = (prod+carr)/10;
                 }
                 if(carr!=0)
                      s1 = (char)(carr+'0')+s1;
                 
                 if(str.length()==0)
                     str=s1;
                 else
                 {
                     String nstr = "";
                       int st1 = str.length()-1;
                        int st2 = s1.length()-1;
                     int k1  = i;
                     while(k1!=num2.length()-1)
                     {
                         nstr = (str.charAt(st1)-'0')+nstr;
                           st1--;
                         k1++;
                     }
                     
                    // nstr = str.charAt(str.length()-1)+"";
                     carr=0;
                //    System.out.println(nstr);
                     
                     while(st1>=0 && st2>=0)
                     {
                         int sum  =  str.charAt(st1)-'0' + s1.charAt(st2)-'0' + carr ;
                         carr = sum/10;
                         nstr = (char)(sum%10+'0') + nstr;
                         st1--;
                         st2--;
                     }
                     
                     while(st2>=0)
                     {
                         int sum = s1.charAt(st2)-'0' + carr;
                         carr= sum/10;
                         nstr = (char)(sum%10+'0')+nstr;
                         st2--;
                     }
                     if(carr!=0)
                     {
                         nstr = (char)(carr+'0')+nstr;
                     }
                     str = nstr;
                 }
                 
              //   System.out.println(str+" "+s1);
             }
        
        int i1 =0;
        
        String cr = "";
        
        while(i1<str.length() && str.charAt(i1)=='0')
              i1++;
        
        while(i1<str.length())
        {
            cr = cr + str.charAt(i1);
            i1++;
        }
        
        if(cr.length()==0)
            cr="0";
        
        return cr;
             
    }
} 

/*
105
 92

    105
    92
    */