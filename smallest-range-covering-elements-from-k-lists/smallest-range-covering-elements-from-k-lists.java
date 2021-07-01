class Solution {
    
    class Pair
    {
        int a;
        int b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    
    public int[] smallestRange(List<List<Integer>> list) {
        
        PriorityQueue<Pair> minpq = new PriorityQueue<Pair>((a,b)->(list.get(a.b).get(a.a)-list.get(b.b).get(b.a)));
         PriorityQueue<Pair> maxpq = new PriorityQueue<Pair>((b,a)->(list.get(a.b).get(a.a)-list.get(b.b).get(b.a)));
        
        HashSet<String> set=new HashSet<String>();
        
        int ansl=-100001;
        int ansr=100001;
        
        for(int i=0;i<list.size();i++)
        {
            List<Integer> ll = list.get(i);
            minpq.add(new Pair(0,i));
            maxpq.add(new Pair(0,i));
        }
        
        while(true)
        {
         //  System.out.println(minpq);
          //  System.out.println(maxpq);
           // System.out.println(set);
            
            while(!maxpq.isEmpty())
            {
                Pair k11 = maxpq.peek();
                if(!set.contains(k11.a+" "+k11.b))
                    break;
            //    System.out.println(k11.a+" "+k11.b+"(())");
                maxpq.remove();
            }
            Pair p1 = maxpq.peek();
            
            Pair p2 = minpq.peek();
            
            int lval = list.get(p2.b).get(p2.a);
            int rval = list.get(p1.b).get(p1.a);
            
           if(ansr-ansl > (rval-lval))
           {
               ansl=lval;
               ansr=rval;
           }
            
            Pair k = minpq.remove();
            String str = k.a+" "+k.b;
            set.add(str);
            if(k.a == list.get(k.b).size()-1)
                break;
            Pair k1 = new Pair(k.a+1,k.b);
            minpq.add(k1);
            maxpq.add(k1);
            
        }
        
        return new int[]{ansl,ansr};
        
    }
}

/*

*********************

4 10 15 24 26
0 9  12 20
5 18 22 30
    
*********************

18 20 24
20 18 12 10 9 5 4 0
blacklist - 0 4 5 9 10 12
ans - 5
    */