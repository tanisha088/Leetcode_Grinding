class Solution {
    public int maximumProduct(int[] nums) {
        /*
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
                PriorityQueue<Integer> pq1= new PriorityQueue<Integer>((a,b)->(b-a));

        
              for(int i=0;i<nums.length;i++)
              {
                  if(pq.size()<3)
                      pq.add(nums[i]);
                  else if(pq.peek()<nums[i])
                  {
                      pq.poll();
                      pq.add(nums[i]);
                  }
                  
                  if(pq1.size()<2)
                      pq1.add(nums[i]);
                  else if(pq1.peek()<nums[i])
                  {
                      pq1.add(nums[i]);
                  }
              }
        
        int max=0
        /*
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
        */
        
        /*
         PriorityQueue<Integer> poheap = new PriorityQueue<>();
        PriorityQueue<Integer> neheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            poheap.offer(num);
            neheap.offer(num);
            if (poheap.size() > 3) {
                poheap.poll();
            }
            if (neheap.size() > 2) {
                neheap.poll();
            }
        }
        int c1 = 1;
        int max = 0;
        while (!poheap.isEmpty()) {
            max = poheap.poll();
            c1 *= max;
        }
        System.out.println(c1+" "+max);
        while (!neheap.isEmpty()) {
            max *= neheap.poll();
        }
        return Math.max(c1, max);
    }
}


*/



Arrays.sort(nums);


 
   return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);

    }
}







//-4 -2 2 4

/*
a b -------c------d e

3 elements from end=> if +ve --true
    if(rend<0)
        choose the last 3
    else if(r2end<0)
2 elements from lend and 1 from rend 
    

-5 -4 -3 -2 -1

*/





