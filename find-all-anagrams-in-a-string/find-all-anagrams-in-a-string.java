class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
//         HashMap<Character,Integer> h= new HashMap<Character,Integer>();
//         for(int i=0;i<p.length();i++)
//         {
//             h.put(p.charAt(i),h.getOrDefault(p.charAt(i),0)+1);
//         }
        
        
//         int st=0;
//         int end=0;
//         List<Integer> ans = new ArrayList<Integer>();
//         while(end<s.length())
//         {
//             boolean b= true;
//             while(end<s.length())
//             {
//                   System.out.println(st+" "+end);
//                int m = h.getOrDefault(s.charAt(end),0);
             
//                 if(m<=0)
//                 {
//                     b=false;
//                     break;
//                 }
                
//                 h.put(s.charAt(end),h.getOrDefault(s.charAt(end),0)-1);
//                  end++;
              
//            if(end-st == p.length())
//                  ans.add(st);
//             }
               
//             if(!b)
//             {
//                 while(st<end)
//                 {
//                  h.put(s.charAt(st),h.getOrDefault(s.charAt(st),0)+1);  
//                     st++;
//                 }
                
//                 st=end;
//             }
//             else
//             {
//                st++;
//                 end++;
//             }
//         }
        
//         return ans;
        
        
        
        // HASHMAP IS STILL NEED
        
            HashMap<Character,Integer> h= new HashMap<Character,Integer>();
                int count=0;

        for(char c :p.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
            count++;
        }
        int st=0;
        int end=0;
        List<Integer> ll = new ArrayList<Integer>();
        while(end<s.length())
        {
            char e = s.charAt(end);
            char es =  s.charAt(st);
            if(h.containsKey(e))
            {
            h.put(e,h.getOrDefault(e,0)-1);
                if(h.get(e)>=0)
                count--;
            }
            end++;
            while(count==0)
            {
                    if(end-st==p.length())
                    {
                        ll.add(st);
                    }
                 es =  s.charAt(st); 
                if(h.containsKey(es))
                {
                h.put(es,h.get(es)+1);
                    if(h.get(es)>0)
                    count++;
                }
                    st++;
            }
            
        }
        
        return ll;
    }
}