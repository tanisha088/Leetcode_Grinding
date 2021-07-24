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
    public int smallestChair(int[][] times, int targetFriend) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(a.a-b.a));
        
                 HashMap<Integer,ArrayList<Integer>> h = new HashMap<Integer,ArrayList<Integer>>();

        
        int m = times[targetFriend][0];
        int n= times[targetFriend][1];
        
        for(int i=0;i<times.length;i++)
        {
            pq.add(new Pair(times[i][0],times[i][1]));
        }
        
        PriorityQueue<Integer> ending =  new PriorityQueue<>();
        int count=0;
        for(int i=1;i<100001;i++)
        {
            int m1 = pq.peek().a;
            
               if(h.containsKey(i))
            {
                ArrayList<Integer> list = h.getOrDefault(i,new ArrayList<Integer>());
                h.remove(i);
                   
                   for(int k1=0;k1<list.size();k1++)
                       ending.add(list.get(k1));
               
            }
            
            if(m1==i)
            {
                Pair pp = pq.remove();
                if(ending.size()==0)
                {
                    ArrayList<Integer> list = h.getOrDefault(pp.b,new ArrayList<Integer>());
                    list.add(count); 
                     
                if(pp.a==m)
                    return count;
                    h.put(pp.b,list);
                    count++;
                }
                else
                {
                    int pos =  ending.remove(); 
                     ArrayList<Integer> list = h.getOrDefault(pp.b,new ArrayList<Integer>());
                    list.add(pos);
                     
                if(pp.a==m)
                    return pos;
                    h.put(pp.b,list);
                }
               
            }
            
       
            
        }
        
//         int count=0;
        
//         while(!pq.isEmpty() && pq.peek().b>=m)
//         {
//             if(pq.peek().a==m && pq.peek().b==n)
//                 return count;
//             count++;
//             pq.remove();
//         }
        
//         return count;
        
          int m2 = pq.isEmpty()?Integer.MAX_VALUE:ending.remove();
            
            return Math.min(m2,count);
    }
}