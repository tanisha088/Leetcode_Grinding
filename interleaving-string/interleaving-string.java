class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
     
        if(s1.length()+s2.length()!=s3.length())
            return false;
        int[][] dp =  new int[s1.length()+1][s2.length()+1];
        for(int[] i:dp)
        Arrays.fill(i,-1);
           return fn(s1,s2,s3,dp);
    }
    
    public boolean fn(String s1,String s2,String s3,int[][] dp)
    {
        if(dp[s1.length()][s2.length()]!=-1)
            return dp[s1.length()][s2.length()]==0?false:true;
        
         if(s3.length()==0)
           { dp[s1.length()][s2.length()]=1;  return true;}
        
        if(s1.length()==0)
        {
            dp[s1.length()][s2.length()]= (s2.equals(s3))?1:0;
            return s2.equals(s3);
        }
        
        if(s2.length()==0)
         {            dp[s1.length()][s2.length()]= (s1.equals(s3))?1:0;
   return s1.equals(s3);}
        
        boolean b1=false;
        boolean b2=false;
        
        if(s1.charAt(0)==s3.charAt(0))
            b1=fn(s1.substring(1,s1.length()),s2,s3.substring(1,s3.length()),dp);
        
        if(s2.charAt(0)==s3.charAt(0))
            b2=fn(s1,s2.substring(1,s2.length()),s3.substring(1,s3.length()),dp);
        
   //     System.out.println(b1+" "+b2+" "+s1+" "+s2+" "+s3);
        
     
                   
             boolean res = b1||b2;
        
            dp[s1.length()][s2.length()]= (res==true)?1:0;
        
        return res;
    }
    }
