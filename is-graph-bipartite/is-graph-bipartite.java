class Solution {
    class Pair
    {
        int a;
        int b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public boolean isBipartite(int[][] graph) {
        
//         int n = graph.length;
//    int[] arr= new int[n];
//         for(int q=0;q<arr.length;q++)
//         {
//             if(arr[q]==0)
//                 if(!bfs(graph,arr,q))
//                     return false;
//         }
        
//         return true;
//     }
//         public boolean bfs(int[][] graph,int[] arr,int q)
//         {
             
//         LinkedList<Integer> list= new LinkedList<Integer>();
        
//         list.add(q);
//         arr[q]=1;
//         int res=1;
//         while(!list.isEmpty())
//         {
//           int a = list.removeFirst();
//             if(arr[a]==0)
//                 arr[a]=1;
            
//           //  for(int k=0;k<arr.length;k++)
//           //      System.out.println(arr[k]);
            
//           //  System.out.println("********");
            
//             for(int j=0;j<graph[a].length;j++)
//             {
//                  if(arr[graph[a][j]]==0)
//                     {
//                         arr[graph[a][j]]=(arr[a]==1?2:1);
//                         list.add(graph[a][j]);
//                      res++;
//                     }
//                     else if(arr[graph[a][j]]==arr[a])
//                         return false;
//             }
            
          
//         }
        
//         return true;
//         }
        
        int[] ans = new int[graph.length];
                HashSet<Integer> h = new HashSet();

        for(int k=0;k<ans.length;k++)
        {
            if(ans[k]!=0)
                continue;
            
        LinkedList<Pair> ll = new LinkedList<Pair>();
        ll.add(new Pair(k,1));
        ans[k]=1;
    
        h.add(k);
        while(!ll.isEmpty())
        {
            Pair p1 = ll.remove();
            for(int i=0;i<graph[p1.a].length;i++)
            {
                int m =  graph[p1.a][i];
                int val = (p1.b==1?2:1);
                if(!h.contains(m))
                {
                    ll.add(new Pair(m,val));
                    ans[m]=val;
                    h.add(m);
                }
                else
                {
                    if(ans[m]!=val)
                        return false;
                }
            }
        }
        }
   
        return true;
    }
}