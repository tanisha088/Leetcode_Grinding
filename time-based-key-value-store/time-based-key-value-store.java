class TimeMap {
HashMap<String,String> h;
    HashMap<String,ArrayList<Integer>> h2 ;
    /** Initialize your data structure here. */
    public TimeMap() {
         h= new HashMap<String,String>();
       h2 = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        String m = key +" "+timestamp;
        h.put(m,value);
        ArrayList<Integer> ll = h2.getOrDefault(key,new ArrayList<Integer>());
        ll.add(timestamp);
        h2.put(key,ll);
    }
    
    public String get(String key, int timestamp) {
       int lo=0;
        ArrayList<Integer> list = h2.getOrDefault(key,new ArrayList<Integer>());
        int hi=list.size()-1;
        if(hi<0)
            return "";
        int ind=-1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(list.get(mid)==timestamp)
                 return h.get(key+" "+list.get(mid));
            if(list.get(mid)>timestamp)
                hi=mid-1;
            else
            {
                ind = Math.max(mid,ind);
                lo=mid+1;
            }
        }
   //     System.out.println(list+" "+lo);
    //   System.out.println(lo+" "+list.size()+" "+list.get(lo));
        
         if(ind==-1)
             return "";
        
      
        
        return h.get(key+" "+list.get(ind));
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */