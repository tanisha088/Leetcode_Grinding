class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
     
        HashMap<String,Integer> h= new HashMap<String,Integer>();
        HashMap<Integer,Integer> par= new HashMap<Integer,Integer>();
        int tot=accounts.size();
        for(int i=0;i<accounts.size();i++)
        {
            par.put(i,i);
            boolean u=false;
            List<String> list= accounts.get(i);
            for(int j=1;j<list.size();j++)
            {
                if(h.containsKey(list.get(j)) && h.get(list.get(j))!=i)
                {
                    int a1 = find(h.get(list.get(j)),par);
                    int b1 = find(i,par);
                    par.put(a1,b1);
                    if(a1!=b1)
                        tot--;
                    u=true;
                }
                else
                    h.put(list.get(j),i);
            }
        }
        
        List<List<String>> result= new ArrayList<List<String>>();
        for(int i=0;i<accounts.size();i++)
        {
            result.add(new ArrayList<String>());
        }
      
        for(int i=0;i<accounts.size();i++)
        {
            int m = find(i,par);
            if(result.get(m).size()==0)
                result.get(m).add(accounts.get(i).get(0));
            for(int j=1;j<accounts.get(i).size();j++)
            {
                if(!result.get(m).contains(accounts.get(i).get(j)))
                 result.get(m).add(accounts.get(i).get(j));
            }
         
        }
        
        for(int i=0;i<result.size();i++)
        {
            ArrayList<String> a2 = new ArrayList<String>();
            if(result.get(i).size()==0)
                continue;
            a2.add(result.get(i).get(0));
            result.get(i).remove(0);
            Collections.sort(result.get(i));
            for(int j=0;j<result.get(i).size();j++)
                a2.add(result.get(i).get(j));
            result.set(i,a2); 
        }
    int i=0;
        
         while(result.size()!=tot)
         {
            // System.out.println(result+" "+i+" "+tot);
             if(result.get(i).size()>0)
                 i++;
             else
                 result.remove(i);
         }
        return result;
    }
    
    public int find(int a,HashMap<Integer,Integer> par)
    {
        if(par.get(a)==a)
            return a;
        
        return find(par.get(a),par);
    }
}