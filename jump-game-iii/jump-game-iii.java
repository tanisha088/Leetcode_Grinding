class Solution {
    public boolean canReach(int[] arr, int start) {
        
        /*
        int so =-1;
        int eo=-1;
        if(arr[start]==0)
            return true;
        for(int i=0;i<=start;i++)
            if(arr[i]==0)
            {
                so=i;
                break;
            }
        
        for(int i=arr.length-1;i>=start;i--)
        {
            if(arr[i]==0)
            {
                eo=i;
                break;
            }
        }
        
    boolean[] dp1= new boolean[arr.length];
        
 
        
     if(check(dp1,arr,start,end) || check1(dp1,arr,so,start))
         return true;
    return false;
    }
    
    public boolean check(boolean[] dp1,int[] arr,int st,int end)
    {
        dp1[end]=true;
        for(int i=end-1;i>=0;i--)
        {
            if(arr[i]==0)
            {
                dp1[i]=true;
                continue;
            }
        }
    }
    */
        
        
        LinkedList<Integer> list= new LinkedList<Integer>();
        HashSet<Integer> h= new HashSet<Integer>();
        list.add(start);
        h.add(start);
        while(!list.isEmpty())
        {
          //  System.out.println(list);
            int a = list.remove();
            if(arr[a]==0)
                return true;
            
            if(arr[a]+a<arr.length && !h.contains(arr[a]+a))
            {
                h.add(a+arr[a]);
                list.add(a+arr[a]);
            }
            if(a-arr[a]>=0 && !h.contains(a-arr[a]))
            {
                h.add(a-arr[a]);
                list.add(a-arr[a]);
            }
            
            /*
            for(int i=1;i<=arr[a];i++)
            {
                if(i+a>=arr.length)
                    break;
                if(!h.contains(i+a))
                list.add(a+i);
                h.add(a+i);
            }
             for(int i=1;i<=arr[a];i++)
            {
                if(a-i<0)
                    break;
                if(!h.contains(a-i))
                list.add(a-i);
                h.add(a-i);
            }
            */
        }
        
        return false;
        
}
}