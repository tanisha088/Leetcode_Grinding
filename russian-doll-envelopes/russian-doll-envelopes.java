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
    public int maxEnvelopes(int[][] envelopes) {
     
        if(envelopes.length==0)
            return 0;
        Pair[] array = new Pair[envelopes.length];
        int[] arr= new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            Pair p = new Pair(envelopes[i][0],envelopes[i][1]);
            array[i]=p;
            arr[i]=1;
        }
        int res=0;
        /*
                   Arrays.sort(array, (p1, p2) -> p1.a-p2.a);

        int res=1;
        
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<i;j++)
            {
              if(array[i].a>array[j].a && array[i].b>array[j].b)
              {
                  arr[i]=Math.max(arr[j]+1,arr[i]);
                  res=Math.max(res,arr[i]);
              }
            }
        }
        
        return res;
        */
        
        
        /*
        Arrays.sort(array,(p1,p2)-> ((p1.a==p2.a)?(p2.b-p1.b):p1.a-p2.a));
        arr[0]=array[0].b;
        for(int i=1;i<array.length;i++)
        {
            int in = bis(arr,0,res,array[i].b);
            System.out.println(array[i].b+" "+in);
            arr[in]=array[i].b;
            res=Math.max(in,res);
        }
        */
        
         Arrays.sort(array,(p1,p2)-> ((p1.a==p2.a)?(p2.b-p1.b):p1.a-p2.a));
        int[] ans = new int[array.length];
        ans[0]=array[0].b;
         res=0;
        for(int i=1;i<array.length;i++)
        {
            int in = bins(ans,0,res,array[i].b);
            ans[in]=array[i].b;
            res=Math.max(in,res);
        }
        
        return res+1;
    }
    
    public int bins(int[] array,int lo,int hi,int el)
    {
        while(lo<=hi)
        {
            int mid = lo+ (hi-lo)/2;
            if(array[mid]==el)
                return mid;
            if(array[mid]>el)
                hi=mid-1;
            else
                lo=mid+1;
        }
        
        return lo;
    }
    
    public int bis(int[] arr,int lo,int hi,int el)
    {
        while(lo<=hi)
        {
            int mid=lo + (hi-lo)/2;
            if(arr[mid]<el)
                lo=mid+1;
            else
                hi=mid-1;
                
        }
        
        return lo;
    }
    
}