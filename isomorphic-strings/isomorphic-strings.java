class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> h= new HashMap<Character,Character>();
        HashMap<Character,Character> tmap = new HashMap<Character,Character>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(tmap.containsKey(t.charAt(i)) && tmap.get(t.charAt(i))!=s.charAt(i))
                return false;
            if(h.containsKey(s.charAt(i)))
            {
                char m = h.get(s.charAt(i));
                if(m!=t.charAt(i))
                    return false;
            }
            
            h.put(s.charAt(i),t.charAt(i));
            tmap.put(t.charAt(i),s.charAt(i));
        }
        
        return true;
    }
}