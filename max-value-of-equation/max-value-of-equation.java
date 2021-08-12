class Solution {
    
    class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    
 /*
 
 yi + yj + xj - xi 
 
 
 
 */
    public int findMaxValueOfEquation(int[][] points, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->((b.y-b.x)-(a.y-a.x)));
        int ans =Integer.MIN_VALUE;
        pq.add(new Pair(points[0][0],points[0][1]));
        for(int i=1;i<points.length;i++)
        {
           while(!pq.isEmpty() && points[i][0]-pq.peek().x> k)
               pq.remove();
            
            if(!pq.isEmpty())
            {
                ans  = Math.max(ans,points[i][0]+points[i][1]+pq.peek().y - pq.peek().x);
            }
            pq.add(new Pair(points[i][0],points[i][1]));
        }
        
        return ans;
    }
}