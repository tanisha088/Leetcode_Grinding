class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int[] a1 =  new int[s.length()];
        int[] a2 =  new int[s.length()];
        
        for(int i=0;i<s.length();i++)
        {
            if(i!=0)
            a1[i] = a1[i-1];
            
            if(s.charAt(i)=='0')
                a1[i]+=1;
            
        }
        
        for(int j=s.length()-1;j>=0;j--)
        {
            if(j!=s.length()-1)
            a2[j] = a2[j+1];
            
            if(s.charAt(j)=='1')
                a2[j]+=1;
        }
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++)
        {
           System.out.println(a1[i]+" "+a2[i]);
            if(s.charAt(i)=='0')
                 ans=Math.min(ans,s.length()-(a1[i]+a2[i]-1));
            else
                ans =Math.min(ans,s.length()-(a1[i]+a2[i]));
        }
        
        return Math.min(ans,a2[0]);
        
    }
}

/*

000

*/