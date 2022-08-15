class Solution {
    public int romanToInt(String s) {
        
        int ans=0;
        
        HashMap<Character,Integer> h = new HashMap();
        h.put('I',1);
         h.put('V',5);
         h.put('X',10);
         h.put('L',50);
         h.put('C',100);
         h.put('D',500);
         h.put('M',1000);
        int i=0;
        
        while(i<s.length())
        {
            
            int m  =0;
             if(i<s.length()-1)
           m= h.get(s.charAt(i+1));
            int n = h.get(s.charAt(i));
            
            if(i<s.length()-1 && m>n)
            {
                ans += (m-n);
                i+=2;
            }
            else
            {
                ans+=n;
                i++;
            }
        }
        
        return ans;
    }
}

