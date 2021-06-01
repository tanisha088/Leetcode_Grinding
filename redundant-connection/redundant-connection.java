class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        
        for(int i=0;i<edges.length;i++)
        {
            int a= edges[i][0];
            int b=edges[i][1];
            
            if(!h.containsKey(a))
                h.put(a,a);
            if(!h.containsKey(b))
                h.put(b,b);
        
            if(union(a,b,h))
                return new int[]{a,b};
        }
        
        return new int[]{-1,-1};
    }
    
    public int find(int a,HashMap<Integer,Integer> h)
    {
        if(h.get(a)==a)
            return a;
        
        return find(h.get(a),h);
    }
    
    public boolean union(int a,int b,HashMap<Integer,Integer> h)
    {
        int a1 = find(a,h);
        int b1 = find(b,h);
        if(a1==b1)
            return true;
        h.put(b1,h.get(a1));
        return false;
    }
}