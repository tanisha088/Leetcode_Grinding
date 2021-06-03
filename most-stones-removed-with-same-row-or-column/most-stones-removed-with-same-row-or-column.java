class Solution {
    public int removeStones(int[][] stones) {
        
        HashMap<Integer,Integer> parent = new HashMap<Integer,Integer>();
        int grp=0;
        int max=0;
        for(int i=0;i<stones.length;i++)
            max=Math.max(stones[i][0],max);
        max+=1;
        for(int i=0;i<stones.length;i++)
        {
            int a=stones[i][0];
            int x=stones[i][1];
            int b = max +  x;
            
            if(!parent.containsKey(a) && !parent.containsKey(b))
            {
                parent.put(a,a);
                parent.put(b,a);
                grp+=1;
            }
            else if(!parent.containsKey(a))
            {
                parent.put(a,find(b,parent));
            }
            else if(!parent.containsKey(b))
            {
                parent.put(b,find(a,parent));
            }
            else
            {
                if(find(a,parent)!=find(b,parent))
                {
                    grp-=1;
                    int j1 = find(b,parent);
                    parent.put(find(a,parent),j1);
                }
            }
        }
        
    System.out.println(parent);
        
        return stones.length-grp;
    }
    
    public int find(int a,HashMap<Integer,Integer> par)
    {
        if(par.get(a)==a)
            return a;
        
        int k = find(par.get(a),par);
        par.put(a,k);
        return k;
    }
}