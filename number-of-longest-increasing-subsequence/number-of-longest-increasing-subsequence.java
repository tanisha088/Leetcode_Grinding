class Solution {
    public int findNumberOfLIS(int[] nums) {
      int[] arr= new int[nums.length];
        String[] starr=new String[nums.length];
        int[] co = new int[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=1;
            starr[i]=Integer.toString(nums[i]);
        }
        int res=1;
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(arr[j]+1>=arr[i])
                    {
                        String m = starr[j]+" "+Integer.toString(nums[i]);
                         if(arr[i]==arr[j]+1)
                        co[i]=co[j]+co[i];
                        else
                            co[i]=co[j];
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
            
            if(co[i]==0)
                co[i]=1;
        }
        
        
        int rr =0;
        for(int i=0;i<co.length;i++)
        {
          if(arr[i]==res)
              rr+=co[i];
        }
        return rr;
    }
}