class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        
        long[] arr  =  new long[100002];
        int lastval = -1;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<segments.length;i++)
        {
            arr[segments[i][0]]+=(long)segments[i][2];
            arr[segments[i][1]]-=(long)segments[i][2];
            set.add(segments[i][1]);
            lastval =  Math.max(lastval,segments[i][1]);
        }
       
        
        for(int i=1;i<arr.length;i++)
        {
           
            arr[i]=arr[i-1]+arr[i];
      
        }
        
        
      
        List<List<Long>> list = new ArrayList<List<Long>>();
        int i =1;
        for(;i<=lastval;)
        {
            List<Long> ll = new ArrayList<Long>();
            if(arr[i]==0)
            {
                i++;
                continue;
            }
            long m  = arr[i];
            int st = i;
            int end=i;
            i=i+1;
            while(i<arr.length && i<=lastval && arr[i]==m && !set.contains(i))
            {
                end=i;
                i++;
            }
            
            ll.add((long)st);
            ll.add((long)(end+1));
            ll.add((long)m);
            
            list.add(ll);
        }
        
        return list;
    }
}