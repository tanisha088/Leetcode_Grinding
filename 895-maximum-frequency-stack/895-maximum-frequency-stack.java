class FreqStack {

    HashMap<Integer,LinkedList<Integer>> h;
    
     HashMap<Integer,Integer>h1;
    
    public FreqStack() {
        
h = new HashMap<Integer,LinkedList<Integer>>();
        h1 = new HashMap<Integer,Integer>();
    }
    
    public void push(int val) {
      
        h1.put(val,h1.getOrDefault(val,0)+1);
        int k = h1.get(val);
        LinkedList<Integer> list = h.getOrDefault(k,new LinkedList<Integer>());
        list.addFirst(val);
        h.put(k,list);
    }
    
    public int pop() {
         
        LinkedList<Integer> list = h.get(h.size());
        int val =  list.removeFirst();
        
        if(list.size()==0)
        {
            h.remove(h.size());
        }
        else
            h.put(h.size(),list);
        
        h1.put(val,h1.get(val)-1);
        
        return val;
        
    }
}

// h1 ->  5,2  7,2  4,1
// h->   1->{7,5,4}  , 2->{7,5} 3->{}   max=2



/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */



// max-freq ->  hashmap -> integer,arrayList 
// map -> counts of values  5,3  7,2  4,1


// map(integer,ll)
//     +
// map(int,int)
    




















