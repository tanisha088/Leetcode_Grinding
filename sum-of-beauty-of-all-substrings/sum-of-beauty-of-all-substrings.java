class Solution {
    public int beautySum(String s) {
             int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char[] arr=new char[26];
            int mf=0;
            for(int j=i;j<s.length();j++)
            {
               arr[(s.charAt(j)-'a')]+=1;
                int k1 = arr[s.charAt(j)-'a'];
                
                mf =Math.max(mf,k1);
                            int lf=Integer.MAX_VALUE;

                for(int k:arr)
                    if(k>0)
                    lf=Math.min(lf,k);
                ans+=mf-lf;
            }
        }
        
        return ans;
    }
}