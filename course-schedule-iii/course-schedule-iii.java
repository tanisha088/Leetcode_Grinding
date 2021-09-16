class Solution {
    
   // public class
    
    public int scheduleCourse(int[][] courses) {
        
        Arrays.sort(courses,(a,b)->(a[1]-b[1]));
        
        int tottime=0;
        int size=0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));
        
        for(int i=0;i<courses.length;i++)
        {
            pq.add(courses[i][0]);
            tottime+=courses[i][0];
            
            if(tottime>courses[i][1])
            {
               tottime -= pq.remove();
            }
            
            size= Math.max(size,pq.size());
        }
        
        return size;
    }
}


// start -   100,200   200,1300  1000,1250  2000,2200

///1000 , 1000+200-
//     1000   500
    
//     500    1000