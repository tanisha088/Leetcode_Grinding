class Solution {
    public boolean canReach(int[] arr, int start) {
     
       ArrayList<Integer>[] array = new ArrayList[arr.length];
        for(int i=0;i<array.length;i++)
            array[i] = new ArrayList();
        
        for(int i=0;i<arr.length;i++)
        {
            int prev = i-arr[i];
            int next = i+arr[i];
            
            if(prev>=0)
                array[prev].add(i);
            if(next<arr.length)
                array[next].add(i);
        }
        
     //   for(ArrayList<Integer> ll:array)    
      //  System.out.println(ll);
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                continue;
           boolean b  =  dfs(arr,array,i,start,new HashSet<Integer>());
            if(b)
                return true;
        }
        
        return false;
        
    }
    
    public boolean dfs(int[] arr,ArrayList<Integer>[] graph,int i,int start,HashSet<Integer> set)
    {
         set.add(i);
        if(i==start)
            return true;
        
        ArrayList<Integer> list = graph[i];
        
        for(int x=0;x<list.size();x++)
        {
            int el  = list.get(x);
            if(!set.contains(el))
            {
            boolean b1=  dfs(arr,graph,el,start,set);
            if(b1)
                return true;
            }
           
        }
        
        set.remove(i);
        
        return false;
    }

        
}
    /*
    
    i+arr[i] and i-arr[i] 
    
    4,3,5,3,1,4/6,4  
    
    0 1  2  3  4     5  6 
    
      4     1 0/5/6  2  5
    
    */
    
//         /*
//         int so =-1;
//         int eo=-1;
//         if(arr[start]==0)
//             return true;
//         for(int i=0;i<=start;i++)
//             if(arr[i]==0)
//             {
//                 so=i;
//                 break;
//             }
        
//         for(int i=arr.length-1;i>=start;i--)
//         {
//             if(arr[i]==0)
//             {
//                 eo=i;
//                 break;
//             }
//         }
        
//     boolean[] dp1= new boolean[arr.length];
        
 
        
//      if(check(dp1,arr,start,end) || check1(dp1,arr,so,start))
//          return true;
//     return false;
//     }
    
//     public boolean check(boolean[] dp1,int[] arr,int st,int end)
//     {
//         dp1[end]=true;
//         for(int i=end-1;i>=0;i--)
//         {
//             if(arr[i]==0)
//             {
//                 dp1[i]=true;
//                 continue;
//             }
//         }
//     }
//     */
//     //    return dfs(arr,start);
//         // BFS :::::::::
//         /*
//         LinkedList<Integer> list= new LinkedList<Integer>();
//         HashSet<Integer> h= new HashSet<Integer>();
//         list.add(start);
//         h.add(start);
//         while(!list.isEmpty())
//         {
//           //  System.out.println(list);
//             int a = list.remove();
//             if(arr[a]==0)
//                 return true;
            
//             if(arr[a]+a<arr.length && !h.contains(arr[a]+a))
//             {
//                 h.add(a+arr[a]);
//                 list.add(a+arr[a]);
//             }
//             if(a-arr[a]>=0 && !h.contains(a-arr[a]))
//             {
//                 h.add(a-arr[a]);
//                 list.add(a-arr[a]);
//             }
//         }
        
//         return false;
//         */
        
//         LinkedList<Integer> l =  new LinkedList();
//         HashSet<Integer> set= new HashSet();
//         l.add(start);
//         while(!l.isEmpty())
//         {
//          //   System.out.println(l);
//             int k  =  l.remove();
            
//             if(arr[k]==0)
//                 return true;
            
//             int nd = k + arr[k];
//             int nd1 = k-arr[k];
//         //    System.out.println(nd+" "+nd1+" "+set);
//             if(nd<arr.length && !set.contains(nd) )
//             {
                
//                 l.add(nd);
               
//                 set.add(nd);
                
//             }
//             if( nd1>=0 && !set.contains(nd1))
//             {
//                  l.add(nd1);
//                 set.add(nd1);
//             }
//         }
        
//         return false;
        
// }
    
//     public boolean  dfs(int[] arr,int st)
//     {
//         if(st>=arr.length || st<0)
//             return false;
        
//         if(arr[st]<0)
//             return false;
        
//         if(arr[st]==0)
//             return true;
        
//         arr[st]=-arr[st];
        
//         boolean b1 = dfs(arr,st+arr[st]);   
//         boolean b2 = dfs(arr,st-arr[st]);    
        
//         return b1||b2;
//     }
//}




/*


i+arr[i]=j
k-arr[k]=j


4 3 5 3 7 6 8

-4 -1 -1 3 1 5 5

-1 4 -1 1 5,6 2 5







i-arr[i]=j'



*/