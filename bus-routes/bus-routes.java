class Solution {
    
    
    class Pair
    {
        int a;
        int b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        HashMap<Integer,ArrayList<Integer>> h= new HashMap<Integer,ArrayList<Integer>>();
        
        for(int i=0;i<routes.length;i++)
        {
            for(int j=0;j<routes[i].length;j++)
            {
                int el = routes[i][j];
                
                ArrayList<Integer> ll = h.getOrDefault(el,new ArrayList<Integer>());
                
                ll.add(i);
                
                h.put(el,ll);
            }
        }
        
        
   
        
        LinkedList<Pair> list= new LinkedList<Pair>();
        HashSet<Integer> st = new HashSet<Integer>();
        HashSet<Integer> bus_stop = new HashSet<Integer>();
        int f = source;
        st.add(f);
        int max=0;
        Pair p = new Pair(f,0);
        list.add(p);
        while(!list.isEmpty())
        {
            Pair p1= list.removeFirst();
            int lev = p1.b;
            max=Math.max(lev,max);
            
            int val = p1.a;
            if(val==target)
                return max;
            ArrayList<Integer> arr= h.get(val);
            for(int i=0;i<arr.size();i++)
            {
                if(!bus_stop.contains(arr.get(i)))
                {
               for(int j=0;j<routes[arr.get(i)].length;j++)
               {
                  int el =  routes[arr.get(i)][j];
                    if(!st.contains(el))
                    list.add(new Pair(el,lev+1));
                st.add(el);
               }
                }
                bus_stop.add(arr.get(i));
            }
        }
      
        return -1;
    }
}

