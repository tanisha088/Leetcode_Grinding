class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        
        int[] par = new int[s.length()];
        for(int i=0;i<par.length;i++)
            par[i]=i;
        for(int i=0;i<pairs.size();i++)
        {
            int  a=pairs.get(i).get(0);
            int b = pairs.get(i).get(1);
            
            int a1 = find(a,par);
            int b1 = find(b,par);
            par[a1]=b1;
        }
        int[] leads = new int[par.length];
        for(int i=0;i<leads.length;i++)
            leads[i]=find(i,par);
        HashMap<Integer,PriorityQueue<Character>> h = new HashMap<Integer,PriorityQueue<Character>>();
        
      for(int i=0;i<par.length;i++)
      {
          int a = leads[i];
          PriorityQueue<Character> pq = h.getOrDefault(a,new PriorityQueue<Character>());
          pq.add(s.charAt(i));
          h.put(a,pq);
      }
        
        StringBuilder str1
            = new StringBuilder("");
        for(int i=0;i<par.length;i++)
        {
           PriorityQueue<Character> pq = h.get(leads[i]);
            str1.append(pq.remove());
            h.put(leads[i],pq);
        }
        return str1.toString();
    }
    
    public int find(int a,int[] par)
    {
        if(par[a]==a)
            return a;
        
        int m= find(par[a],par);
        par[a]=m;
        return m;
    }
}