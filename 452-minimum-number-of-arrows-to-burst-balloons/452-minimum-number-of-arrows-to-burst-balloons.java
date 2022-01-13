class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)->(Integer.compare(a[0],b[0])));
      //////////// KKKKKEEEEEEPPPPP IIIINNNNNNN MIIIINNNNNDDDD
        /// EDGEYYYYYYYYYY TC    ------ [[-2147483646,-2147483645],[2147483646,2147483647]]
    
        
        int  count=1;
        int st=points[0][1];
        int i=1;
        while(i<points.length)
        {

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





























// 1,6   2,8  7,12  10,16
    
    
// st=1
// end=6
// arrows=1
    
//     n_start> end  i++
//     else
//     end = n_end count++ i++
        

    
    