class RandomizedSet {

    /** Initialize your data structure here. */
    
    HashSet<Integer> removed;
    
    HashMap<Integer,Integer> h;
    
    LinkedList<Integer> ll ;
    
    int[] arr;
    
    int c;
    
    public RandomizedSet() {
        
   //     ll =  new LinkedList<Integer>();
        h = new HashMap<Integer,Integer>();
        arr =new int[1000000];
        c=0;
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        if(h.containsKey(val))
            return false;
        
       
        h.put(val,c);
        arr[c]=val;
        c++;
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!h.containsKey(val))
            return false;
        
        int m = h.get(val);
        h.remove(val);
         c--;
        if(h.size()==0)
            return true;
       
    //    System.out.println(c+" "+val+" "+h);
        arr[m] = arr[c];
        arr[c]=0;
        h.remove(arr[m]);
        h.put(arr[m],m);
        h.remove(val);
        
        return true;
        
//         c   1
// h    1,0     m=0
// arr 2 , 0

    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        Random rand   = new Random();
        
        int ind =  rand.nextInt(c);
        return arr[ind];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */





/*
["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
[[],[1],[2],[2],[],[1],[2],[]]

c   1
h    1,0  2,1   m=0
arr 1 , 2

*/










