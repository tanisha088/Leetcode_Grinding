class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        
       // 1. make indegree array-> if anyone's indegree >1 -> return edge making it
         //   2. if no one's -> then find the edge making the closed space
           //     3. 
                
       HashMap<Integer,Integer> indeg= new HashMap<Integer,Integer>();
        int blacklist=-1;
        int ac=-1;
        int max=0;
        for(int i=0;i<edges.length;i++)
        {
            int a =edges[i][0];
            int b=edges[i][1];
           
            if(indeg.containsKey(b))
            {
                blacklist=i;
                ac=indeg.get(b);
            }
            max = Math.max(max,Math.max(a,b));
            indeg.put(b,i);
        }
        int[] par= new int[max+1];
        for(int i=1;i<par.length;i++)
            par[i]=i;
        for(int i=0;i<edges.length;i++)
        {
            if(blacklist==i)
                continue;
            int a = edges[i][0];
            int b = edges[i][1];
            int pa = find(a,par);
            int pb = find(b,par);
            if(pa==pb)
            {
                if(blacklist==-1)
                    return new int[]{a,b};
                else
                    return new int[]{edges[ac][0], edges[ac][1]};
            }
            par[pa]=pb;
        }
        
        return new int[]{edges[blacklist][0], edges[blacklist][1]};
    }
    
    public int find(int a,int[] par)
    {
        if(a==par[a])
            return a;
        return find(par[a],par);
    }
}