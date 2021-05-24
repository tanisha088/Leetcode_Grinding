class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numCourses;i++)
            list.add(new ArrayList<Integer>());
       
        // PLEASE ALSO HANDLE A SPECIAL BASE CASE FOR CYCLE 
        
        for(int i=0;i<prerequisites.length;i++)
        {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            
            if(list.get(a).contains(b))
                 return new int[]{};
            list.get(b).add(a);
            
                
        }
        
        int[] tdfs =  new int[numCourses];
        int[] tkahns = new int[numCourses];
          Stack<Integer> st= new Stack<Integer>();
        HashSet<Integer> visi= new HashSet<Integer>();
        HashSet<Integer> h= new HashSet<Integer>();
        
        for(int i=0;i<numCourses;i++)
        {
     //      System.out.println(i+" "+h.contains(i));
        if(!h.contains(i))
        if(!dfs(i,list,st,h,visi))
            return new int[]{};
        }
        
        
        int[] result= new int[numCourses];
        int i=0;
        while(!st.isEmpty())
        {
        result[i]=st.pop();
        i++;
        
        }
        return result;
        
        //t_kahns(list,numCourses);
    }
    
      static boolean dfs(int src, ArrayList<ArrayList<Integer>> adj , Stack<Integer> st,HashSet<Integer> set,HashSet<Integer> visi)
    {
          if(visi.contains(src))
              return false;
          
         visi.add(src);
          
          
        for(int i=0;i<adj.get(src).size();i++)
        {
            if(set.contains(adj.get(src).get(i)))
                 continue;
            
             //   set.add(adj.get(src).get(i));
            
                boolean k = dfs(adj.get(src).get(i),adj,st,set,visi);
               if(!k)
                   return false;
                   
            visi.remove(src);
            
          // st.push(src);
           // System.out.println(adj.get(src).get(i));
              
            }
        
     //   System.out.println(src);
       set.add(src);
          st.push(src);
          
          return true;
    }
}