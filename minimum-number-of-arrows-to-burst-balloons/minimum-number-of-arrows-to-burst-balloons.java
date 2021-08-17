class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)->((a[0]>b[0])?1:-1));
        
    
        int  count=1;
        int st=points[0][1];
        int i=1;
        while(i<points.length)
        {
//                        System.out.println(st+" "+count+" "+points[i][0]);

            if(points[i][0]>st)
            {
                count++;
                st = points[i][1];
            }
            else
            {
                st = Math.min(points[i][1],st);
            }
            
            i++;
        }
        
        return count;
        
    }
}