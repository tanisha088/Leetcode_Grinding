class Solution {

    public int[] getOrder(int[][] tasks) {
        
        PriorityQueue<int[]> task  = new PriorityQueue<int[]>((a,b)->(a[0]-b[0]));
        
        PriorityQueue<int[]> available  = new PriorityQueue<int[]>((a,b)->(a[0]==b[0]?(a[1]-b[1]):a[0]-b[0]));
        
        for(int i=0;i<tasks.length;i++)
        {
            int[] arr = new int[]{tasks[i][0],tasks[i][1],i};
            task.add(arr);
        }
        
       int count=0;
        int[] res= new int[tasks.length];
        int ftime =  task.peek()[0];
        while(count<tasks.length)
        {
            
            if(!task.isEmpty())
            {
                if(available.isEmpty() && task.peek()[0]>ftime)
                    ftime = task.peek()[0];
            while(!task.isEmpty() && task.peek()[0]<=ftime)
            {
                int[] arr = task.remove();
                int[] narr = new int[]{arr[1],arr[2]};
                available.add(narr);
            }
                
            }
     //       for(int[] arr:available)
       //         System.out.println(arr[0]+" "+arr[1]+" ");
      //      System.out.println("(***)"+" "+ftime);
            int[] work =  available.remove();
            ftime = ftime+work[0];
      //      System.out.println(work[0]+" "+work[1]+"^^^");
            res[count] = work[1];
                 count++;
        }
     return res;    
    }
}

/*

tasks - 

tasks - front - time -  available - (proce,index) 
final time - 3 
<=final time - available 
final time -

tasks - pq - arrival  with index 

finaltime = tasks.front 


1,2

*/