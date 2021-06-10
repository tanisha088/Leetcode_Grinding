class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=0;i<deck.length;i++)
        {
            h.put(deck[i],h.getOrDefault(deck[i],0)+1);
        }
        int a=-1;
        int b=-1;
        int gcd=-1;
       for(Map.Entry<Integer,Integer> e:h.entrySet())
       {
           if(a==-1)
           {
               a=e.getValue();
               gcd=a;
               continue;
           }
           
           b=e.getValue();
           
           gcd = fn(a,b);
           a=gcd;
       }
   if(gcd==1)
       return false;
       
        return true;
    }
    
    public int fn(int a,int b)
    {
        if(b==0)
            return a;
        
        return fn(b,a%b);
    }
}