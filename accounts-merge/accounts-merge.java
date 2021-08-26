class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
           HashMap<String,HashSet<Integer>> h = new HashMap();
        
        int[] parents = new int[accounts.size()];
        for(int i=0;i<parents.length;i++)
            parents[i]=i;
        
        for(int i=0;i<accounts.size();i++)
        {
            List<String> l1 = accounts.get(i);
            for(int j=1;j<l1.size();j++)
            {
                if(!h.containsKey(l1.get(j)))
                    h.put(l1.get(j),new HashSet());
              
                HashSet<Integer> set = h.get(l1.get(j));
                if(set.size()==0)
                    set.add(i);
                else
                {
                    int m =0;
                    for(int j1:set)
                        m=j1;
                    
                    int pa = find(parents,i);
                    int pb = find(parents,m);
                    parents[pa]=pb;
                    
                
                }
                
                h.put(l1.get(j),set);
                
            }
        }
        
   //     System.out.println(h);
        
        List<List<String>> list=  new ArrayList();
        HashMap<Integer,List<String>> map = new HashMap();
   
        for(int i=0;i<parents.length;i++)
        {
            int par = find(parents,i);
            List<String> ll = map.getOrDefault(par,new ArrayList());

            for(int j=1;j<accounts.get(i).size();j++)
            {
                if(!ll.contains(accounts.get(i).get(j)))
                    ll.add(accounts.get(i).get(j));
            }
            
            map.put(par,ll);
        }
          //   System.out.println(map);
        
        for(Map.Entry<Integer,List<String>> e:map.entrySet())
        {
            List<String> ll = e.getValue();
            
            Collections.sort(ll);
                      
                String name =  accounts.get(e.getKey()).get(0);
                ll.add(0,name);
    
            list.add(ll);
        }
        
        return list;
        
    }
    
    public int find(int[] parents,int v)
    {
        if(parents[v]==v)
            return v;
        
        int m =  find(parents,parents[v]);
        parents[v] =  m;
        
        return m;
    }
}