class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        
        Arrays.sort(arr);
        
    for(int i=arr.length-1;i>=0;i--)
    {
        if(arr[i]==0)
        {
          if(h.get(arr[i])%2!=0)
              return false;
            continue;
        }
        if(set.contains(arr[i]))
            continue;
       int m = h.get(arr[i]);
        int el = arr[i]>0 ? arr[i]/2 : arr[i]*2;
        
       //      System.out.println(arr[i]+" ");

        if((h.containsKey(arr[i]/2) && arr[i]%2==0 && arr[i]>0) || (h.containsKey(arr[i]*2) && arr[i]<0))
        {
            set.add(arr[i]);
            if(h.get(el)<m)
                return false;
            
            int m1 =h.get(el);
            
            h.put(el,m1-m);
        }
        else if(h.get(arr[i])!=0)
        {
                return false;
        }
      //  System.out.println(i);
    }
        
        return true;
    
    
    }
    
    
}