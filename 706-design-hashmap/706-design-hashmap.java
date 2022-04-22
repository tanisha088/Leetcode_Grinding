class MyHashMap {
    
    int[] arr;

    public MyHashMap() {
        
        arr = new int[1000001];
        
        for(int i=0;i<arr.length;i++)
            arr[i] = Integer.MAX_VALUE;
    }
    
    public void put(int key, int value) {
        
        arr[key] = value;
     }
    
    public int get(int key) {
        
        if(arr[key]==Integer.MAX_VALUE)
            return -1;
        
        return arr[key];
    }
    
    public void remove(int key) {
        
        arr[key] = Integer.MAX_VALUE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */