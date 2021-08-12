class Solution {
    public int[] avoidFlood(int[] rains) {
        
        HashMap<Integer,Integer> used = new HashMap();
        TreeSet<Integer> dodry = new TreeSet();
        
        int[] arr= new int[rains.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<rains.length;i++)
        {
            if(used.containsKey(rains[i]))
            {
               
                // int val=-1;
                // for(int l:dodry)
                // {
                //    if(l>used.get(rains[i]))
                //        val=l;
                // }
                // if(val==-1)
                //     return new int[]{};
                
                Integer val = dodry.higher(used.get(rains[i]));
          ///      System.out.println(dodry+" "+i);
                if(val==null)
                    return new int[]{};
                
                arr[val]=rains[i];
                
                dodry.remove(val);
                
                used.put(rains[i],i);
            }
            else 
            {
              if(rains[i]==0)
              {
                  dodry.add(i);
              }
                else
                {
                    used.put(rains[i],i);
                }
            }
     
                
        }
        for(int v:dodry)
            arr[v]=1;
        return arr;
    }
}
