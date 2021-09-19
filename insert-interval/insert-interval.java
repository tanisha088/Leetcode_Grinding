class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int sp=newInterval[0];
        int ep=newInterval[1];
        ArrayList<int[]> list=  new ArrayList();
        int i=0;
        for( i=0;i<intervals.length;i++)
        {
            if(sp>intervals[i][1])
            {
                list.add(intervals[i]);
                
            }
            else if(intervals[i][0]>ep)
            {
                break;
            }
            else
            {
                sp =  Math.min(sp,intervals[i][0]);
                ep =  Math.max(ep,intervals[i][1]); 
                
            }
        }
        
        if(sp!=-1)
            list.add(new int[]{sp,ep});
        
        while(i<intervals.length)
        {
            list.add(intervals[i]);
            i++;
        }
        
        int[][] result = new int[list.size()][2];
        int ind=0;
        for(int[] inn:list)
        {
            result[ind] = inn;
            ind++;
        }
        
        return result;
        
//         if(intervals.length==0)
//             {int[][] ans = new int[1][2];  ans[0] =newInterval; return ans;}
        
//         boolean merge = false;
//         int i=0;
        
//         if(intervals[i][0]>newInterval[1])
//         {
//              int[][] ans = new int[intervals.length+1][2];
//         int vals=1;
//             ans[0]=newInterval;
//         for( i=0;i<intervals.length;i++)
//             ans[vals++]=intervals[i];
                
//         return ans;
//         }
//         int postoinsert=-1;
//         while(!merge && i<intervals.length)
//         {
//             if(intervals[i][1]<newInterval[0])
//             {
                
//                 i++;
//             }
//             else
//             {
//                 if(intervals[i][0]>newInterval[1])
//                 {
//                     postoinsert = i;
                    
//                     break;
//                 }
//                 intervals[i] = new int[]{Math.min(intervals[i][0],newInterval[0]),Math.max(intervals[i][1],newInterval[1])};
//                 merge=true;
//             }
//         }
//         int size=intervals.length;
//        if(merge)
//         {
//             while(i<intervals.length-1)
//             {
//                  if(intervals[i][1]>=intervals[i+1][0])
//                  {
//                      intervals[i+1] = new int[]{intervals[i][0],Math.max(intervals[i][1],intervals[i+1][1])};  
//                      intervals[i]=  new int[]{-1,-1};
//                      size--;
//                      i++;
//                  }
//                 else
//                 {
//                     i++;
//                 }
//             }
           
//            int[][] ans= new int[size][2];
//            int vals = 0;
//            for( i=0;i<intervals.length;i++)
//            {
//                if(intervals[i][0]!=-1)
//                    ans[vals++] = (intervals[i]);
//            }
           
//            return ans;
//         }
        
        
//         int[][] ans = new int[intervals.length+1][2];
//         int vals=0;
//         for( i=0;i<intervals.length;i++)
//             ans[vals++]=intervals[i];
        
//         ans[ans.length-1] = newInterval;
        
//         return ans;
           
//         st,end ----------------
        
//             ------------------ st,end --------------
            
//             ------------  st,end ---------------
            
//             2,5
            
//             1. end < st[0]
            
//             2. st > end[last]
            
//             3.   min (Start)  and max(end)  if end<St  don't merge 
            
//                end of new < st of i -->  position = i  and break   else  i++
                   
//                    else merge = true and merge all
                       
                       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}