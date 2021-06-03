class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        
        int[] par= new int[n+1];
            int[] alice = new int[n+1];
        int[] bob = new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            par[i]=i;
            alice[i]=i;
            bob[i]=i;
        }
        int tot=0;
        for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];
            if(a==1 || a==2)
                continue;
            
            int f1 = find(edges[i][1],par);
            int f2 = find(edges[i][2],par);
            if(f1!=f2)
                tot++;
            par[f1]=f2;
            alice[f1]=f2;
            bob[f1]=f2;
            
        }
        
    
          for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];
            if(a==2 || a==3)
                continue;
            
            int f1 = find(edges[i][1],alice);
            int f2 = find(edges[i][2],alice);
            if(f1!=f2)
                tot++;
            alice[f1]=f2;
            
        }
        
          for(int i=0;i<edges.length;i++)
        {
            int a = edges[i][0];
            if(a==1 || a==3)
                continue;
            
            int f1 = find(edges[i][1],bob);
            int f2 = find(edges[i][2],bob);
            if(f1!=f2)
                tot++;
            bob[f1]=f2;
            
        }
        
     int el =find(alice[1],alice);
        for(int i=2;i<alice.length;i++)
            if(find(alice[i],alice)!=el)
                return -1;
        
          el =find(bob[1],bob);
        for(int i=2;i<bob.length;i++)
            if(find(bob[i],bob)!=el)
                return -1;
        
        return edges.length-tot;
    }
    
    public int find(int a,int[] par)
    {
        if(par[a]==a)
            return a;
        
        int k = find(par[a],par);
        par[a]=k;
        return k;
    }
}