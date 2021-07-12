class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] dp= new int[nums.length];
        int max=Integer.MIN_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(b[0]-a[0]));
        
        for(int i=0;i<nums.length;i++)
        {
            if(pq.isEmpty())
            {
                dp[i]=nums[i];
                pq.add(new int[]{dp[i],i});
            }
            else
            {
                while(!pq.isEmpty() && (pq.peek()[1]<i-k || pq.peek()[0]<0))
                {
                    pq.remove();
                }
                
                dp[i]=(pq.isEmpty()?0:pq.peek()[0])+nums[i];
                pq.add(new int[]{dp[i],i});
            }
            
            max=Math.max(dp[i],max);
        }
        
        return max;   
    }
}