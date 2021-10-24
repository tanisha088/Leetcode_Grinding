class Solution {
       HashMap<String,Integer> h;
   public  class StringComps implements Comparator<String>
    {
        public int compare(String a,String b)
        {
      //      System.out.println(h);
            if(h.get(a)!=h.get(b))
            {
                if(h.get(a)>h.get(b))
                    return 1;
                else if(h.get(a)<h.get(b))
                    return -1;
              
            }
            char[] arr=  a.toCharArray();
            char[] ar1 = b.toCharArray();
            int i=0;
            for(i=0;i<Math.min(arr.length,ar1.length);i++)
            {
                if(arr[i]<ar1[i])
                    return 1;
                else if(arr[i]>ar1[i])
                    return -1;
                
            }
            
            if(i==arr.length && i==ar1.length)
                return 0;
            if(i==arr.length)
                return 1;
            return -1;
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        
       h = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++)
        {
            if(!h.containsKey(words[i]))
               h.put(words[i],1);
               else
               {
                   int j=h.get(words[i]);
                   h.put(words[i],j+1);
               }
        }
        System.out.println(h);
        PriorityQueue<String> pq  = new PriorityQueue<>(new StringComps());
        
        for(Map.Entry<String,Integer> e:h.entrySet())
        {
            pq.add(e.getKey());
            
            if(pq.size()>k)
                pq.poll();
        }
        
        List<String> res= new ArrayList<String>();
        while(!pq.isEmpty())
            res.add(0, pq.poll());

        
    //    Collections.reverse(res);
        return res;
    }
}