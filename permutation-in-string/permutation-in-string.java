class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        
        for(char c:s1.toCharArray())
            h.put(c,h.getOrDefault(c,0)+1);
        
        int st=0;
        int end=0;
        int count=s1.length();
        while(end<s2.length())
        {
            char e = s2.charAt(end);
            char es=  s2.charAt(st);
            
            if(h.containsKey(e))
            {
                h.put(e,h.get(e)-1);
                if(h.get(e)>=0)
                count--;
            }
            
            end++;
                       //     System.out.println(st+" "+end+" "+h+" "+count);

            while(count==0)
            {
             //   System.out.println(st+" "+end+" "+h+" "+count);
                es=  s2.charAt(st);
                if(end-st == s1.length())
                {
                    return true;
                }
                
                if(h.containsKey(es))
                {
                    h.put(es,h.get(es)+1);
                    if(h.get(es)>0)
                        count++;
                }
                
                st++;
            }
        }
        
        return false;
        
    }
}


/*
 
 store s1 -> in hashmap
 
 

*/