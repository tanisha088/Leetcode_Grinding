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
      
//         HashSet<Integer> visi= new HashSet<Integer>();
//         HashSet<Integer> h= new HashSet<Integer>();
        
//         for(int i=0;i<numCourses;i++)
//         {
//      //      System.out.println(i+" "+h.contains(i));
//         if(!h.contains(i))
//         if(!dfs(i,list,h,visi))
//             return false;
//         }
        
//         return true;
//     }
    
//     public boolean dfs(int src, ArrayList<ArrayList<Integer>> adj,HashSet<Integer> visi,HashSet<Integer> h)
//     {
//         if(visi.contains(src))
//             return false;
        
//         visi.add(src);
        
//         if(h.contains(src))
//             return true;
        
          
//         for(int i=0;i<adj.get(src).size();i++)
//         {
//             if(h.contains(adj.get(src).get(i)))
//                 continue;
            
            
//             boolean k = dfs(adj.get(src).get(i),adj,visi,h);
//             if(!k)
//                 return false;
            
//         }
        
        
//         h.add(src);
//         return true;
//     }
        
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<numCourses;i++)
        {
              HashSet<Integer> visi = new HashSet();
            if(!set.contains(i))
                if(dfs(i,list,visi,set))
                    return false;
        }
        
        return true;
    }
    
    public static boolean dfs(int src,ArrayList<ArrayList<Integer>> list,HashSet<Integer> visited,HashSet<Integer> set)
    {
        if(visited.contains(src))
            return true;
        
        visited.add(src);
        
        for(int i=0;i<list.get(src).size();i++)
        {
            if(!set.contains(list.get(src).get(i)))
            {
            boolean k=  dfs(list.get(src).get(i),list,visited,set);
            if(k)
                return true;
            }
        }
        
        set.add(src);
        visited.remove(src);
        
        return false;
    }
}