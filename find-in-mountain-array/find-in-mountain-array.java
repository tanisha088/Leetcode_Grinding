/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
          int lo=0;
        int hi=arr.length()-1;
        int ans=0;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(mid>0 && arr.get(mid)<arr.get(mid-1))
            {
                hi=mid-1;
            }
            else
            {
                ans=Math.max(ans,mid);
                lo=mid+1;
            }
        }
        System.out.println(ans);
    
       
        int bs1 = bs1(arr,0,ans,target+0.5);
        if(bs1!=-1 && arr.get(bs1)==target)return bs1;
         
         int bs = bs(arr,ans+1,arr.length()-1,target+0.5);
                System.out.print(bs+" "+bs1);

        if(bs!=-1 && bs<arr.length() && arr.get(bs)==target)
            return bs;
        
        return -1;
    }
    
    
public int bs1(MountainArray arr,int lo,int hi,double target)
{
    while(lo<=hi)
    {
        int mid = lo + (hi-lo)/2;
        if(arr.get(mid)<target)
        {
            lo=mid+1;
        }
        else
            hi=mid-1;
    }
    
    return lo-1;
}
    
    public int bs(MountainArray arr,int hi,int lo,double target)
    {
        while(hi<=lo)
        {
            int mid =hi + (lo-hi)/2;
            if(arr.get(mid)<=target)
            {
                lo=mid-1;
            }
            else
                hi=mid+1;
        }
        
        return hi;
    }
    
    
}