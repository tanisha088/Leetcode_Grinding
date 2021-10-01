class Solution {
    public int removeStones(int[][] stones) {
     
        int max=0;
        int ans=0;
        
        for(int i=0;i<stones.length;i++)
        {
            max=Math.max(stones[i][0],max);
        }
        
        max+=1;
        int st=max;
        for(int i=0;i<stones.length;i++)
        {
            max =Math.max(max, stones[i][1] + st);
        }
        
        int[] parent=  new int[max+1];
        
        for(int i=0;i<parent.length;i++)
            parent[i]=i;
        
        int[] size= new int[parent.length];
        
      
        
        for(int i=0;i<stones.length;i++)
        {
            int a = stones[i][0];
            int b = st + stones[i][1];
            
            int pa = find(parent,a);
            int pb = find(parent,b);
            
            
            if(pa==pb)
            {
                size[pb]+=1;
                continue;
            }
            
            parent[pa] = pb;
            size[pb]+=(size[pa]+1);
            
        }
        
        for(int i=0;i<size.length;i++)
        {
     //       System.out.println(size[i]+" "+parent[i]);
            if(size[i]>0 && parent[i]==i)
                ans = ans + size[i]-1;
            
        }
        
        return ans;
    }
    
    public int find(int[] parent,int a)
    {
        if(parent[a]==a)
            return a;
        
        return find(parent,parent[a]);
    }
}



