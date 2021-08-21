class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        int st=0;
        int end=0;
   
        int ans=0;
        
        PriorityQueue<Integer> max = new PriorityQueue<Integer>((a,b)->b-a);
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        
        while(end<nums.length)
        {
            max.add(nums[end]);
            min.add(nums[end]);
            end++;
            
            while(max.peek()-min.peek()>limit)
            {
               max.remove(nums[st]);
                min.remove(nums[st]);
                
              st++;
            }
            
            ans = Math.max(ans,end-st);
        }
        
        return ans;
    }
}







/*


|max-min| <= limit  

10,12,16,25


*/





