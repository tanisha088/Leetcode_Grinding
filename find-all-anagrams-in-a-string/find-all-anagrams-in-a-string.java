class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        HashMap<Character,Integer> h = new HashMap();
        for(char c:p.toCharArray())
            h.put(c,h.getOrDefault(c,0)+1);
    
        ArrayList<Integer> list=  new ArrayList();
        
        int st=0;
        int end=0;
        int ans=0;
        int count=0;
        while(end<s.length())
        {
            if(h.containsKey(s.charAt(end)))
            {
                h.put(s.charAt(end),h.get(s.charAt(end))-1);
                    count++;
            }
            
            
                while(st<=end && (!h.containsKey(s.charAt(end)) || h.get(s.charAt(end))<0))
                {
//System.out.println(st+" "+end+" "+h+"**"+" "+ );
                    if(h.containsKey(s.charAt(st)))
                    {h.put(s.charAt(st),h.get(s.charAt(st))+1);
                    count--;}
                    st++;
                }
                
       //   System.out.println(st+" " +end+" "+h+" "+count);
                 if(end-st+1==p.length())
                list.add(st);
          
          // System.out.println(h+" "+count+" "+st+" "+end);
            end++;    
        }
        
        return list;
    }
}