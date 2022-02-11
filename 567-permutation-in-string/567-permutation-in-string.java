class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
      HashMap<Character,Integer> h = new HashMap();
        
        for(char c:s1.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        int st=0;
        int k=h.size();
        for(int i=0;i<s2.length();i++)
        {
            char c1 =  s2.charAt(i);
                    
        //  System.out.println(st+" "+h+" "+k+" "+i);
            
            if(h.containsKey(c1))
            {
                h.put(c1,h.get(c1)-1);
                if(h.get(c1)==0)
                    k--;
                
                if(k==0)
                    return true;
              
                if(h.get(c1)>=0)
                    continue;
            }
            
             while(st<=i)
                {
                    char  c = s2.charAt(st);
                 
                    if(!h.containsKey(c))
                    {
                        st++;
                        continue;
                    }
                  if(h.get(c)==0)
                        k++;
                    h.put(c,h.get(c)+1);
                 
                 st++;
                 
                 if(h.containsKey(c1) && h.get(c1)>=0)
                    break;
                    
                 
                }
        
            
            }
        
        return false;
    }
}


/*
 
 store s1 -> in hashmap
 
 
 not contains -> st => end
 if contains and -ve -> till  it is not positive

*/