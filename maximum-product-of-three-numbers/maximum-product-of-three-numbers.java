class Solution {
    public int maximumProduct(int[] nums) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
                PriorityQueue<Integer> pq1= new PriorityQueue<Integer>((a,b)->(b-a));

        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
            int mx3=Integer.MIN_VALUE;
            int mi1=Integer.MAX_VALUE;
            int mi2=Integer.MAX_VALUE;
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>mx1)
            {
              mx3=mx2;
                mx2=mx1;
                mx1=nums[i];
            }
            else if(nums[i]>mx2)
            {
                mx3=mx2;
                mx2=nums[i];
            }
            else if(nums[i]>mx3)
                mx3=nums[i];
            
            if(nums[i]<mi1)
            {
                mi2=mi1;
                mi1=nums[i];
            }
            else if(nums[i]<mi2)
                mi2=nums[i];
        }
        
        return Math.max(mx1*mx2*mx3 ,mx1*mi1*mi2);
        
        
    }
}