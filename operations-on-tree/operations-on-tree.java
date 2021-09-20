class LockingTree {

    ArrayList<ArrayList<Integer>> graph;
    ArrayList<ArrayList<Integer>> ascs;
    HashMap<Integer,Integer> lock;
    
    public LockingTree(int[] parent) {
        
        graph=  new ArrayList();
        ascs = new ArrayList();
        for(int i=0;i<parent.length;i++)
            {graph.add(new ArrayList()); ascs.add(new ArrayList());}
        
        for(int i=1;i<parent.length;i++)
        {
            graph.get(parent[i]).add(i);
            ascs.get(i).add(parent[i]);
        }
        
        lock=  new HashMap<Integer,Integer>();
        
    }
    
    public boolean lock(int num, int user) {
        if(lock.containsKey(num))
            return false;
        
        lock.put(num,user);
        
        return true;
    }
    
    public boolean unlock(int num, int user) {
        
        if(lock.containsKey(num) && lock.get(num)==user)
        {
            lock.remove(num);
            return true;
        }
        
        return false;
    }
    
    public boolean upgrade(int num, int user) {
        if(lock.containsKey(num))
            return false;
        
        ArrayList<Integer> ll = graph.get(num);
        boolean b=false;
        for(int i:ll)
        {
            boolean b1= dfs(i,graph,-1);
            if(b1)
            {
                b=true; break;
            }
        }
        
        if(!b)
            return false;
        
         ll = ascs.get(num);
      
        for(int i:ll)
        {
            if(dfs(i,ascs,-1))
              { return false;}
        }
     
        
        ll = graph.get(num);
       
        for(int i:ll)
        {
           dfs(i,graph,1);
            
        }
        
        lock.put(num,user);
        return true;
    }
    
    
    public boolean dfs(int i,ArrayList<ArrayList<Integer>> g,int todo)
    {
        if(todo==1 && lock.containsKey(i))
            lock.remove(i);
        
       boolean ans= (lock.containsKey(i)?true:false);
        
      ArrayList<Integer> ll = g.get(i);
        
        for(int el:ll)
        {
            boolean m = dfs(el,g,todo);
            if(m)
                ans=true;
        }
        
        return ans;
            
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */