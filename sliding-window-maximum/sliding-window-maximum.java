class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        
        Deque<Integer> maxpq = new ArrayDeque<Integer>();
       
        int st=0;
        int i=0;
        for( i=0;i<k-1;i++)
        {
            while(!maxpq.isEmpty() &&  maxpq.peekLast()<nums[i])
                maxpq.removeLast();
            
            maxpq.addLast(nums[i]);
        }
        
        int[] arr= new int[nums.length-k+1];
        
        while(i<nums.length)
        {
               while(!maxpq.isEmpty() &&  maxpq.peekLast()<nums[i])
                maxpq.removeLast();
            
            maxpq.addLast(nums[i]);
            
       //     System.out.println
            arr[i-k+1] = maxpq.peekFirst();
            
            if(maxpq.peekFirst()==nums[st])
            {
                maxpq.removeFirst();
            }
       //      System.out.println(maxpq+" "+st+" "+i);
            st++;
            i++;
            
           
        }
        
        return arr;
        
    }
}


    
  