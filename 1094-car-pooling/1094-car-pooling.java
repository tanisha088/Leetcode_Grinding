class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[0]-b[0]));
        Arrays.sort(trips,(a,b)->(a[1]-b[1]));
        int cap  = 0;
        for(int i=0;i<trips.length;i++)
        {
            while(!pq.isEmpty() && pq.peek()[0]<=trips[i][1])
            {
            cap -=   (pq.remove()[1]);
            }
            
             pq.add(new int[]{trips[i][2],trips[i][0]});
            cap+= trips[i][0];
            
            if(cap>capacity)
                return false;
        }
        
        return true;
    }
}

/*



*/