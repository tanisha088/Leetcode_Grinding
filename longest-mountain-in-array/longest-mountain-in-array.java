class Solution {
    public int longestMountain(int[] arr) {
      
        int st=0;
        int ans=0;
        while(st<arr.length)
        {
            int val = arr[st];
            st++;
            int c=1;
            int mount=0;
            while(st<arr.length && arr[st]>val)
            {
                c++;
                mount=st;
                val = arr[st];
                st++;
            }
            
            if(c==1)
                continue;
            
            
            int c2=0;
            
            while(st<arr.length && arr[st]<arr[mount])
            {
                c2++;
                mount = st;
                st++;
            }
            
            if(c2==0)
                continue;
            
            st--;
            ans= Math.max(ans,c+c2);
        }
        
        return ans;
    }
}