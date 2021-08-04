class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet();
        
        /*
        
        st=0
        end=0  -> !present add else don't and get answer end++   
        
        while(set.contains(st))
        set.remove(st)
        st++
        
        */
        
        int st=0;
        int end=0;
        int ans=0;
        while(end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                 set.add(s.charAt(end));
          //      System.out.println(st+" "+end);
                ans= Math.max(ans,end-st+1);
            }
           else
           {
            while(set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(st));
                st++;
            }
               set.add(s.charAt(end));

           }
            
            end++;
        }
        
        return ans;
    }
}