class Solution {
    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        
        int[] par= new int[n+1];
        for(int i=0;i<=n;i++)
            par[i]=i;
        
        for(int i=threshold+1;i<=n;i++)
        {
            int v1 = i;
            for(int j=2;j<=n/i;j++)
            {
                union(v1,i*j,par);
                v1 = i*j;
                
            }
        }
        
    
        List<Boolean> list= new ArrayList<Boolean>();
        for(int i=0;i<queries.length;i++)
        {
            if(find(queries[i][0],par)==find(queries[i][1],par))
                list.add(true);
            else
                list.add(false);
        }
        
        return list;
    }
    public int find(int a,int[] par)
    {
        if(par[a]==a)
            return a;
        
        return find(par[a],par);
    }
    public void union(int i,int j,int[] par)
    {
        int a = find(i,par);
        int b = find(j,par);
        
        par[a]=b;
        
    }
}