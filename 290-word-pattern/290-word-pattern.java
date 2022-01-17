class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> h= new HashMap();
        String[] arr = s.split("\\s+");
        int i=0;
        HashMap<String,Character> set = new HashMap();
        for(char c:pattern.toCharArray())
        {
            if(i==arr.length)
                return false;
            if(h.containsKey(c))
            {
                if(!h.get(c).equals(arr[i]))
                return false;
             
            }
               
                if(set.containsKey(arr[i]) && set.get(arr[i])!=c)
                    return false;
            
            h.put(c,arr[i]);
            set.put(arr[i++],c);
            
            
                
        }
        
        if(i!=arr.length)
            return false;
        
        return true;
    }
}