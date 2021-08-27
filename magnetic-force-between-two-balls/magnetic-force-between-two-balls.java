class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=0;
        int hi=position[position.length-1];
        
        int ans=Integer.MIN_VALUE;
        while(lo<=hi)
        {
            int mid = lo +( hi-lo)/2;
            if(fn(mid,position,m))
            {
                ans = Math.max(ans,mid);
                lo = mid+1;
            }
            else
                hi= mid-1;
        }
        
        return ans;
    }
    
    public boolean fn(int mid,int [] position,int m)
    {
        
        int prev=position[0];
        m--;
        for(int i=1;i<position.length;i++)
        {
            if(position[i]-prev>=mid)
            {
                m--;
                prev=position[i];
            }
        }
        
        if(m<=0)
            return true;
      return false;
    }
}


// placedballs < total 

//  high = mid-1
    
// else
//     update anss
    
//     low = mid+1