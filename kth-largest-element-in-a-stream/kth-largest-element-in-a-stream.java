class KthLargest {

    //     ---  (k) ->  < kth  priorityqueue(min) + <=k 
    //     ---
    //     ---
    //     ---
    //     ---
    
    PriorityQueue<Integer> pq;
    int k1 = 0;
   
    public KthLargest(int k, int[] nums) {
      
        pq= new PriorityQueue<Integer>();
        k1 = k;
        for(int i:nums)
        {
            if(pq.size()<k)
                pq.add(i);
            else
            {
               if(pq.peek() < i)
               {
                   pq.remove();
                   pq.add(i);
               }
                
            }
        }
    }

    public int add(int val) {
              
        if(pq.size()<k1)
            pq.add(val);
        else
        {
               if(pq.peek() < val)
               {
                   pq.remove();
                   pq.add(val);
               }
        }   
        return pq.peek();
     
    }
}

//  4 5 8 
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */