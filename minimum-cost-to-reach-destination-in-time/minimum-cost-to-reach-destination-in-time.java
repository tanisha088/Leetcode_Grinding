class Solution {
    
    class Pair
    {
        int vert;
        int cost;
        int time;
        
       Pair(int vert,int cost,int time)
       {
           this.vert=vert;
           this.cost=cost;
           this.time=time;
       }
    }
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        
        int[] ans = new int[passingFees.length];
        Arrays.fill(ans,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(a.cost-b.cost));
            
       // HashSet<Integer> set = new HashSet<Integer>();
        
        ArrayList<ArrayList<Pair>> list = new ArrayList<ArrayList<Pair>>();
        
        for(int i=0;i<passingFees.length;i++)
            list.add(new ArrayList<Pair>());
        for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];
            int b = edges[i][1];
            int co  = edges[i][2];
            Pair p1 = new Pair(a,co,-1);
            Pair p2 = new Pair(b,co,-1);
            
            list.get(a).add(p2);
            list.get(b).add(p1);
        }
        
        pq.add(new Pair(0,passingFees[0],0));
        
        while(!pq.isEmpty())
        {
            int size = pq.size();
            while(size>0)
            {
                Pair p1 =  pq.remove();
                size--;
               
                
                if(p1.time>=ans[p1.vert] || p1.time>maxTime)
                    continue;
                 
                ans[p1.vert]=p1.time;
                
//System.out.println(p1.vert+" "+p1.cost+" "+p1.time);
             //   set.add(p1.vert);
              
                
                int ver =  p1.vert;
                
                 if(ver==passingFees.length-1)
                    return p1.cost;
                
                int fees = p1.cost;
                
                ArrayList<Pair> ll = list.get(ver);
                
                for(int j=0;j<ll.size();j++)
                {
                    int v1 = ll.get(j).vert;
                    int tm = ll.get(j).cost;
                    
                  //  if(set.contains(v1))
                    //    continue;
                    
                    Pair pnew  = new Pair(v1,fees+passingFees[v1],p1.time+tm);
                    pq.add(pnew);
                }
                
                
            }
            
        }
        
        return -1;
    }
}