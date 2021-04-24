
class LRUCache {
class DLL
{
    int key;
    int val;
    DLL prev;
    DLL next;
    DLL(int key,int val)
    {
        this.key =key;
        this.val =val;
        this.prev=null;
        this.next=null;
    }
}
int c;
       
    DLL head = new DLL(-1,-1);
    DLL tail = new DLL(-1,-1);
   HashMap<Integer,DLL> h = new HashMap<Integer,DLL>();
    //System.out.println(head.key+" "+head.val+" "+head.next.val);
    public LRUCache(int capacity) {
         c=capacity;
      head.next = tail;
    tail.prev=head;
        }
    
    public int get(int key) {
   //   System.out.println(h);
   //  System.out.println(key + " " +h.containsKey(key));
        if(h.containsKey(key))
        {
            DLL node = h.get(key);
            DLL noden = node.next;
            DLL nodep = node.prev;
            nodep.next = noden;
            noden.prev = nodep;
        node.next = head.next;
        head.next=node;
        node.prev=head;
        node.next.prev = node;
            return h.get(key).val;
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {
        if(h.containsKey(key))
        {
            DLL ntbd =  h.get(key);
            DLL ntbp = ntbd.prev;
            DLL ntbn = ntbd.next;
            
            ntbp.next = ntbn;
            ntbn.prev =ntbp;
        }
        else
        {
        if(h.size()>=c)
        {
            DLL del =  tail.prev.prev;
            int k = tail.prev.key;

            del.next = tail;
            tail.prev = del;
            h.remove(k);

        }
        }
        DLL node = new DLL(key,value);
        node.next = head.next;
        node.prev=head;
        head.next.prev=node;
        head.next = node;
        
        h.put(key,node);
        
        DLL h1 = head;
     
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */