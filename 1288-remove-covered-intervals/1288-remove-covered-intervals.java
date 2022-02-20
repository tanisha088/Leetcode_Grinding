class Solution {
    
    public class NewComp implements Comparator<int[]>
    {
        public int compare(int[] a,int[] b)
        {
            if(a[0]==b[0])
                return b[1]-a[1];
            return a[0]-b[0];
        }
    }
        
    
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,new NewComp());
        
        for(int i=0;i<intervals.length;i++)
            System.out.println(intervals[i][0]+" "+intervals[i][1]);
        
        int yes = 0;
        int maxl = intervals[0][1];
        
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][1]<=maxl)
            {
                yes++;
            }
            
            maxl = Math.max(maxl,intervals[i][1]);
        }
        
        return  intervals.length-yes;
        
    }
}


