class Solution {
    public char findTheDifference(String s, String t) {
        
       HashMap<Character,Integer> h = new HashMap();
        
        for(char c:t.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        for(char c:s.toCharArray())
        {
            h.put(c,h.get(c)-1);
            if(h.get(c)==0)
                h.remove(c);
        }
        
        for(Map.Entry<Character,Integer> e:h.entrySet())
            return e.getKey();
        
        return '0';
        
    }
}