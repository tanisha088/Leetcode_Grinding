class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
   int[] arr= new int[n];
        for(int q=0;q<arr.length;q++)
        {
            if(arr[q]==0)
                if(!bfs(graph,arr,q))
                    return false;
        }
        
        return true;
    }
        public boolean bfs(int[][] graph,int[] arr,int q)
        {
             
        LinkedList<Integer> list= new LinkedList<Integer>();
        
        list.add(q);
        arr[q]=1;
        int res=1;
        while(!list.isEmpty())
        {
          int a = list.removeFirst();
            if(arr[a]==0)
                arr[a]=1;
            
          //  for(int k=0;k<arr.length;k++)
          //      System.out.println(arr[k]);
            
          //  System.out.println("********");
            
            for(int j=0;j<graph[a].length;j++)
            {
                 if(arr[graph[a][j]]==0)
                    {
                        arr[graph[a][j]]=(arr[a]==1?2:1);
                        list.add(graph[a][j]);
                     res++;
                    }
                    else if(arr[graph[a][j]]==arr[a])
                        return false;
            }
            
          
        }
        
        return true;
        }
}