class RandomizedCollection {

    HashMap<Integer,HashSet<Integer>> h;
    int[] arr;
    int c;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        h  = new HashMap<Integer,HashSet<Integer>>();
        arr = new int[2*100000+1];
        c=0;
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        
        boolean m =  !h.containsKey(val);
       HashSet<Integer> set = h.getOrDefault(val,new HashSet<Integer>());
        set.add(c);
        arr[c]=val;
        c++;
        h.put(val,set);
        
        return m;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        
    //    System.out.println(h);
        if(!h.containsKey(val))
            return false;
        
        HashSet<Integer> h1 = h.get(val);
        int ind=0;
        for(int v:h1)
        {
            ind = v;
            break;
        }
        
        
        h1.remove(ind);
        
        
        h.put(val,h1);
        if(h1.size()==0)
            h.remove(val);
        
        c--;
        int val2 = arr[c];
        arr[ind]=0;
        if(c==0 || c==ind)
            return true;
     
        HashSet<Integer> h2 = h.get(val2);
        h2.remove(c);
        h2.add(ind);
        
        arr[ind] = val2;
        arr[c]=0;

        
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        Random r =  new Random();
        
        int indi =  r.nextInt(c);
        
        return arr[indi];
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */