class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        
       
        HashMap<String,PriorityQueue<String>> h = new HashMap<String,PriorityQueue<String>>();
        for(int i=0;i<tickets.size();i++)
        {
            String a = tickets.get(i).get(0);
            String b = tickets.get(i).get(1);
            
    PriorityQueue<String> pq = h.getOrDefault(a,new PriorityQueue<String>());
             pq.add(b);
            h.put(a,pq);
            
            
        }
        
        HashSet<String> vis = new HashSet<String>();
        
        LinkedList<String> result = new LinkedList<String>();
        
        System.out.println(h);
        
        dfs(vis,result,h,"JFK");
        result.addFirst("JFK");
        return result;
    }
    
    public void dfs(HashSet<String> vis,LinkedList<String> result,HashMap<String,PriorityQueue<String>> h , String src)
    {
       
        if(!h.containsKey(src))
            return;
        PriorityQueue<String> pq = h.get(src);
        
        while(!pq.isEmpty())
        {
             String m =pq.remove();

        vis.add(src+" "+m);
        
        dfs(vis,result,h,m);
            
            result.addFirst(m);
            
        }
         
    }
}

