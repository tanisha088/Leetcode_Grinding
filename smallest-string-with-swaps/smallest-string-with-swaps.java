class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
       
        int[] parent = new int[s.length()];
        
        for(int i=0;i<parent.length;i++)
            parent[i]=i;
        
        for(int i=0;i<pairs.size();i++)
        {
            int a = pairs.get(i).get(0);
            int b = pairs.get(i).get(1);
            
            int pa = find(parent,a);
            int pb = find(parent,b);
            
            parent[pa]=pb;
            
        }
        
        HashMap<Integer,StringBuilder> h = new HashMap();
        
        for(int i=0;i<s.length();i++)
        {
            int par =  find(parent,i);
            if(!h.containsKey(par))
                h.put(par,new StringBuilder(""));
            
            h.get(par).append(s.charAt(i)+"");
            
        }
        
        StringBuilder sb = new StringBuilder("");
        int[] indices  = new int[parent.length];
        for(int i=0;i<parent.length;i++)
        {
            if(h.containsKey(i))
            {
                char[] k =  h.get(i).toString().toCharArray();
                Arrays.sort(k);
                
                StringBuilder sb1  = new StringBuilder("");
                for(char c:k)
                    sb1.append(c+"");
                
                h.put(i,sb1);
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            int par = find(parent,i);
            int ind = indices[par];
            indices[par]+=1;
            sb.append(h.get(par).charAt(ind));
        }
        
        return sb.toString();
    }
    
    public int find(int[] parent,int v)
    {
        if(parent[v]==v)
            return v;
        
        int m =  find(parent,parent[v]);
        parent[v] = m;
        
        return m;
    }
}