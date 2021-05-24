class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
         ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numCourses;i++)
            list.add(new ArrayList<Integer>());
        
          for(int i=0;i<prerequisites.length;i++)
        {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            
            list.get(b).add(a);
            
                
        }
      
        HashSet<Integer> visi= new HashSet<Integer>();
        HashSet<Integer> h= new HashSet<Integer>();
        
        for(int i=0;i<numCourses;i++)
        {
     //      System.out.println(i+" "+h.contains(i));
        if(!h.contains(i))
        if(!dfs(i,list,h,visi))
            return false;
        }
        
        return true;
    }
    
    public boolean dfs(int src, ArrayList<ArrayList<Integer>> adj,HashSet<Integer> visi,HashSet<Integer> h)
    {
        if(visi.contains(src))
            return false;
        
        visi.add(src);
        
        if(h.contains(src))
            return true;
        
          
        for(int i=0;i<adj.get(src).size();i++)
        {
            if(h.contains(adj.get(src).get(i)))
                continue;
            
            
            boolean k = dfs(adj.get(src).get(i),adj,visi,h);
            if(!k)
                return false;
            
        }
        
        
        h.add(src);
        return true;
    }
}