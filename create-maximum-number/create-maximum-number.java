class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
     
        String ans ="";
        
        for(int i=0;i<=k;i++)
        {
            if(i>nums1.length|| (k-i)>nums2.length)
                continue;
         String ar1 = fn(nums1,i);
            String ar2 = fn(nums2,k-i);
            
            String res="";
            int j=0;
            int k2=0;
            while(j<ar1.length() && k2<ar2.length() )
            {
                if(ar1.charAt(j)<ar2.charAt(k2))
                {
                    res=res+ ar2.charAt(k2);
                    k2++;
                }
                else if(ar2.charAt(k2)<ar1.charAt(j))
                {
                    res=res+ar1.charAt(j);
                    j++;
                }
                else
                {
                    int jk=j;
                    int jk1=k2;
                   while(jk<ar1.length()  && jk1<ar2.length() && ar1.charAt(jk)==ar2.charAt(jk1))
                   {
                       jk++;
                       jk1++;
                   }
                    
                    char tbaa = (jk>=ar1.length() || (jk1<ar2.length() && ar1.charAt(jk)<ar2.charAt(jk1)))?ar2.charAt(k2++):ar1.charAt(j++);
                    
                    res=res+tbaa;
                }
                
              //  System.out.println(res+" "+j+" "+k2);
            }
            
            while(j<ar1.length())
            {
                res=res+ar1.charAt(j);
                j++;
            }
            
            while(k2<ar2.length())
            {
                res=res+ar2.charAt(k2);
                k2++;
            }
            
            if(res.compareTo(ans)>0)
                ans=res;
            
  //      System.out.println(ar1+" "+ar2+" "+i+" "+res);
        }
      //  System.out.println(ans+"*****");
        char[] fans = ans.toCharArray();
        int[] tbr =  new int[fans.length];
        int in=0;
        for(char c:fans)
        {
            tbr[in]=c-'0';
            in++;
        }
        
        return tbr;
        
    }
    
    
    public String fn(int[] nums,int in)
    {
        
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<nums.length;i++)
        {
                while(!st.isEmpty() && st.peek()<nums[i] && st.size()+nums.length-i-1 >=in)
                    st.pop();
                
            if(st.size()<in)
           st.push(nums[i]);
        }
        
        String str= "";
        
  //      System.out.println(st);
        while(!st.isEmpty())
            str= st.pop() + str;
        
        return str;
    }
}











    
//****************************************************************************************