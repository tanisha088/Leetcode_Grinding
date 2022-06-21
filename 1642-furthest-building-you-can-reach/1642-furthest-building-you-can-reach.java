class Solution {
    
//     // OR USE BINARY SEARCH TO SEE THAT WHETHER FOR A PARTICULAR VALUE OF HEIGHT B/W 1-ARR.LENGTH THE ALLOWED JUMPS ARE ALLOWED ---> BY PUTTING DIFFERENCES INTO A LIST AND SORTING THEM AND SEE IF YOU GET LIST.SIZE-LADDERS DIFFERENCES SUM >= TOTAL BRICKS (KEEP THE LARGEST DISTANCES TO BE TRAVERSED BY THE LADDER)
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    
//         for(int i=1;i<heights.length;i++)
//         {
//             if(heights[i]>heights[i-1])
//             {
//                 pq.add(heights[i]-heights[i-1]);
//             if(pq.size()>ladders)
//                 bricks-=pq.poll();
//             if(bricks<0)
//                 return i-1;
//             }
//         }
        
//         return heights.length-1;
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
    
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(a-b));
        
        int sum = 0;
        
        for(int i=1;i<heights.length;i++)
        {
            int diff = heights[i]-heights[i-1];
            if(diff<=0)
                continue;
            pq.add(diff);
            if(pq.size()>ladders)
            {
                int a  = pq.remove();
                sum = sum + a;
                if(sum>bricks)
                    return i-1;
            }
        }
        
        return heights.length-1;
    
    }
}