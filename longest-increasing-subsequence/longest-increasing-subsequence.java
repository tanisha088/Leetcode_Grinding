class Solution {
    public int lengthOfLIS(int[] nums) {
       // O(N^2) APPROACH ::
        
        int[] arr= new int[nums.length];
        String[] starr=new String[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=1;
        }
        int res=1;
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(arr[j]+1>arr[i])
                    {
                        String m = starr[j]+" "+nums[i];
                        arr[i]=arr[j]+1;
                        starr[i]=m;
                        if(res<arr[i])
                        {
                            res=arr[i];
                            ans=m;
                        }
                    }
                }
            }
        }
        
        
        return res;
    }
}