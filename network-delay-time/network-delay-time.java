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
    
    public class Paircomp implements Comparator<Pair>
    {
        public int compare(Pair a,Pair b)
        {
             return a.b-b.b;
        }
           
    }
    
    public int networkDelayTime(int[][] edges, int n, int k) {
            ArrayList<ArrayList<Pair>> graph= new ArrayList<ArrayList<Pair>>();
        
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<Pair>());
        
        for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0]-1;
            int b = edges[i][1]-1;
            int v = edges[i][2];
            Pair p0 = new Pair(b,v);
            graph.get(a).add(p0);
         //   System.out.println(a+" "+p0.a+" "+p0.b+" "+b);
            
        }
    
  PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Paircomp());
        int[] res= new int[n];
        for(int i=0;i<res.length;i++)
            res[i]=-1;
       pq.add(new Pair(k-1,0));
        boolean[] visited= new boolean[n];
        while(!pq.isEmpty())
        {
            Pair p1= pq.remove();
         //   System.out.println(p1.a+" "+p1.b+" *************");
                             if(!visited[p1.a])
                            res[p1.a]=p1.b;

            visited[p1.a]=true;
            
            ArrayList<Pair> list= graph.get(p1.a);
            for(int i=0;i<list.size();i++)
            {
                Pair p2 = list.get(i);
                int v = p2.a;
                int av = p2.b+p1.b;
                
                Pair pn = new Pair(v,av);
         //       System.out.println(av+" "+p1.b+" "+p2.b+" "+p1.a+" "+p2.a);
                if(!visited[pn.a])
                {
            //        System.out.println(pn.a+ " "+pn.b);
                pq.add(pn);
                }
            }
        }
        int ans=0;
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==-1)
                return -1;
            
            ans=Math.max(ans,res[i]);
        }
        
        return ans;
    }
}




