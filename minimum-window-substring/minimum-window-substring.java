class Solution {
    public String minWindow(String s, String t) {
        
//         int st=0;
//         int end=-1;
        
//         HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
//         int matchcount=t.length();
//         int count=0;
//         int ast=0;
//         int aend=0;
//         HashMap<Character,Integer> tmap = new HashMap<Character,Integer>();
        
//         for(int i=0;i<t.length();i++)
//         {
//             tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
//         }
//         while(end<s.length())
//         {
//             while(end<s.length()-1 && count<matchcount)
//             {
//                 end++;
//                 smap.put(s.charAt(end),smap.getOrDefault(s.charAt(end),0)+1);
//                 if(smap.get(s.charAt(end))+1<=tmap.getOrDefault(s.charAt(end),0))
//                 {
//                     count++;
//                 }
               
//             }
            
//             while(st<end && count==matchcount)
//             {
//                  if(smap.getOrDefault(s.charAt(st),0)<=0)
//                      break;
                
//                  smap.put(s.charAt(st),smap.getOrDefault(s.charAt(st),0)-1);
               
//                 st++;
//             }
            
              
//             if(count==matchcount)
//             {
//                 if((aend-ast)>(end-st))
//                 {
//                     aend = end;
//                     ast = st;
//                 }
//             }
//         }
        
//         return s.substring(ast,aend);
        
        
        /*
         s and t  => m and n 
         
         AABC  MAP -> A 2  B 1 C 1
        
          BBAACABAABCACCA
          
          B-> 0
          A-> 0
          C-> 0
          COUNT --
          
          
        
        */
        HashMap<Character,Integer> h = new HashMap();
        String res="";
        for(char c:t.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int count= h.size();
        int st=0;
        int is=0;
        int ie=0;
        int ans=Integer.MAX_VALUE;
        int end=0;
        while(end<s.length())
        {
            char e = s.charAt(end);
            char se = s.charAt(st);
            if(h.containsKey(e))
            {
                h.put(e,h.get(e)-1);
                if(h.get(e)==0)
                    count--;
            }
            end++;
            
            while(count==0)
            {
                se = s.charAt(st);
                if(h.containsKey(se))
                {
                h.put(se,h.get(se)+1);
                    if(h.get(se)>0)
                        count++;
                }

                 if(end-st <= ans)
                 {
                                //      System.out.println(count+" "+st+" "+end);
          
                     is=st;
                     ie=end;
                     ans= end-st;
                 }
                
                st++;
                
               
            }
        }
  //   System.out.println(is+" "+ie);
        return s.substring(is,ie);
        
    }
}
/*

aabcabc

abc

a-0 b-0 c-0

*/