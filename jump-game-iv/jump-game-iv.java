class Solution {
    public int minJumps(int[] arr) {
        
        HashMap<Integer,ArrayList<Integer>> h= new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
           ArrayList<Integer> ll = h.getOrDefault(arr[i],new ArrayList<Integer>());
           ll.add(i);
           h.put(arr[i],ll);
        }
      
         LinkedList<Integer> list= new LinkedList<Integer>();
        HashSet<Integer> set= new HashSet<Integer>();
        list.add(0);
        set.add(0);
        int ans=0;
        while(!list.isEmpty())
        {
          //  System.out.println(list);
            
            int size= list.size();
            while(size!=0)
            {
            int a = list.remove();
            if(a==arr.length-1)
                return ans;
            
            if(a+1<arr.length && !set.contains(1+a))
            {
                set.add(a+1);
                list.add(a+1);
            }
            if(a-1>=0 && !set.contains(a-1))
            {
                set.add(a-1);
                list.add(a-1);
            }
              for(int i=0;i<h.getOrDefault(arr[a],new ArrayList<Integer>()).size();i++)
        {
            if(!set.contains(h.get(arr[a]).get(i)))
               list.add(h.get(arr[a]).get(i));
                  set.add(h.get(arr[a]).get(i));
        }
                if(h.containsKey(arr[a]))
                    h.remove(arr[a]);
                size--;
            }
                        ans++;

        }
        
        return ans;
        
      // return dfs(arr,0,h);
    }
    
    public boolean dfs(int[] arr,int st,HashMap<Integer,ArrayList<Integer>> h)
    {
        if(st>arr.length-1 || st<0)
            return false;
        
        if(arr[st]<0)
            return false;
        
        arr[st]=-arr[st];
        

       boolean b1= dfs(arr,st+1,h);
       boolean b2 = dfs(arr,st-1,h);
        boolean b3 = false;
        for(int i=0;i<h.get(arr[st]).size();i++)
        {
            if(dfs(arr,h.get(arr[st]).get(i),h))
                return true;
        }
        
        return b1||b2;
    }
}