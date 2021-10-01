class Solution {
    
    public class Compinter implements Comparator<int[]>
    {
        public int compare(int[] a,int[] b)
        {
            if(b[0]-a[0]<0)
            {
                return 1;
            }
            else if(b[0]-a[0]>0)
           return -1;
            else
                return 0;
        }
    }
    
    public int[][] merge(int[][] intervals) {
        
        
        Arrays.sort(intervals,new Compinter());
        int st= intervals[0][0];
        int end = intervals[0][1];
        
        List<int[]> list=  new ArrayList();
        for(int i=1;i<intervals.length;i++)
        {
         //    System.out.println(list+" "+st);
            if(intervals[i][0]>end)
            {
               
                list.add(new int[]{st,end});
                st=intervals[i][0];
                end = intervals[i][1];
            }
           else
           {
               end = Math.max(end,intervals[i][1]);
           }
        }
        
        list.add(new int[]{st,end});
        
        int[][] ans = new int[list.size()][2];
        
        for(int i=0;i<list.size();i++)
            ans[i] = list.get(i);
        
        
        return ans;
        
    }
}