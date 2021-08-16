class Solution {
    public int[][] merge(int[][] intervals) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        
        
        for(int i=0;i<intervals.length;i++)
            pq.add(intervals[i]);
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        
        while(pq.size()>1)
        {
            int[] in = pq.poll();
            int[] sec =  pq.poll();
            
            if(in[1]<sec[0])
            {
                List<Integer> l2  = new ArrayList<Integer>();
                l2.add(in[0]);
                l2.add(in[1]);
                l.add(l2);
                
                pq.add(sec);
            }
            else
            {
               pq.add(new int[]{in[0],Math.max(in[1],sec[1])});
            }
        }
        
         List<Integer> list  = new ArrayList<Integer>();
                list.add(pq.peek()[0]);
                list.add(pq.peek()[1]);
                l.add(list);
        
        int[][] result = new int[l.size()][2];
        
        for(int i=0;i<result.length;i++)
        {
            result[i][0] = l.get(i).get(0);
            result[i][1] = l.get(i).get(1);
        }
        
        return result;
    }
}