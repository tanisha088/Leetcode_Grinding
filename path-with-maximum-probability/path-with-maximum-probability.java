class Solution {
    public class Pair
    {
        int a;
        double b;
        Pair(int a,double b)
        {
            this.a=a;
            this.b=b;
        }
    }
    
     public class Paircomparator implements Comparator<Pair> {
    
     // THIS IS OPTIONAL ------->  @Override
    public int compare(Pair p1,Pair p2) {
       
            if(p1.b>p2.b)
                return -1;
        else
            return 1;
        
    }
     }
    
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        
        ArrayList<ArrayList<Pair>> graph= new ArrayList<ArrayList<Pair>>();
        
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<Pair>());
        
        for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];
            int b = edges[i][1];
            double v = succProb[i];
            Pair p0 = new Pair(a,v);
            Pair p1  = new Pair(b,v);
            graph.get(a).add(p1);
            graph.get(b).add(p0);
         //   System.out.println(a+" "+p0.a+" "+p0.b+" "+b);
            
        }
    
        
   /*     
        for(int i=0;i<n;i++)
        {
            ArrayList<Pair> li=  graph.get(i);
        //    System.out.println(i+" *********");
            for(int j=0;j<li.size();j++)
                System.out.println(li.get(j).a+" "+li.get(j).b);
        }
        */
         PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Paircomparator());
        
       pq.add(new Pair(start,1.0));
        boolean[] visited= new boolean[n];
        while(!pq.isEmpty())
        {
            Pair p1= pq.remove();
            visited[p1.a]=true;
            if(p1.a==end)
                return p1.b;
            ArrayList<Pair> list= graph.get(p1.a);
            for(int i=0;i<list.size();i++)
            {
                Pair p2 = list.get(i);
                int v = p2.a;
                double av = p2.b*p1.b;
                
                Pair pn = new Pair(v,av);
         //       System.out.println(av+" "+p1.b+" "+p2.b+" "+p1.a+" "+p2.a);
                if(!visited[pn.a])
                pq.add(pn);
            }
        }
        
        return 0;
    }
}