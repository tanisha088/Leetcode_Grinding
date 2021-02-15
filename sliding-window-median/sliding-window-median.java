class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
PriorityQueue<Integer> maxpq = new PriorityQueue<>(1, Collections.reverseOrder());
    PriorityQueue<Integer> minpq = new PriorityQueue<Integer>();
 
 double[] medarr= new double[nums.length-k+1];    
        int in=0;
        for(int i=0;i<nums.length;i++)
        {
 if(maxpq.size()==minpq.size())
        {
      if(i==2)
         {
               System.out.println(maxpq);
                System.out.println(minpq);
         }
     maxpq.add(nums[i]);
     if(i==2)
     System.out.println(maxpq.peek());
            minpq.add(maxpq.poll());
         if(i==2)
         {
               System.out.println(maxpq);
                System.out.println(minpq);
         }
        }
        else
        {
            minpq.add(nums[i]);
            maxpq.add(minpq.poll());
        } 
            
              System.out.println(minpq.size()+" "+maxpq.size()+" "+i);
               
            if(i>=k-1)
            {
                double median = 0;
               
                if(maxpq.size()<minpq.size())
                    median = minpq.peek()*1.0;
                else
                    median = (minpq.peek()*1.0 + maxpq.peek()*1.0)/2.0;               
                
                medarr[in++]=median;
                if(nums[i-k+1]<median)
                    maxpq.remove(nums[i+1-k]);
                else
                    minpq.remove(nums[i+1-k]);
                
                
                
                if(maxpq.size()>minpq.size())
                    minpq.add(maxpq.poll());
                
                if(minpq.size()-maxpq.size()>1)
                    maxpq.add(minpq.poll());
                
                
            }
        }
        
        
        return medarr;

  
    }
}