class Solution {
    double answer = 0.0;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            
        String el = equations.get(0).get(0);
        HashMap<String,HashMap<String,Double>> graph= new HashMap<String,HashMap<String,Double>>();
        
        for(int i=0;i<equations.size();i++)
        {
            List<String> list= equations.get(i);
            String a = list.get(0);
            String b = list.get(1);
            double v = values[i];
            
            HashMap<String,Double> h1 = graph.getOrDefault(a,new HashMap<String,Double>());
            
            h1.put(b,v);
            
            graph.put(a,h1);
            
            h1 = graph.getOrDefault(b,new HashMap<String,Double>());
            
            h1.put(a,1.0/v);
            
            graph.put(b,h1);
            
        }
   //     System.out.println(graph);
       
        
                double[] result = new double[queries.size()];

        for(int i=0;i<queries.size();i++)
        {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            
            if(!graph.containsKey(a) || !graph.containsKey(b))
            {
                result[i]=-1;
                continue;
            }
                    HashSet<String> st= new HashSet<String>();
           answer=-1;
             dfs(a,graph,st,1.0,b);
    
            result[i]= answer;
        }
        
        
        return result;
    }
    
    public void dfs(String el,HashMap<String,HashMap<String,Double>> graph,HashSet<String> hash,double ans,String target)
    {
        hash.add(el);
           
      
        if(el.equals(target))
        {
            answer = ans;
            return;
        }
      
        HashMap<String,Double> h= graph.get(el);
        for(Map.Entry<String,Double> e:h.entrySet())
        {
            String ver = e.getKey();
            double val = e.getValue();
            if(!hash.contains(ver))
            {
                dfs(ver,graph,hash,ans*val,target);
            }
        }
    }
}