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
    public int minTaps(int n, int[] ranges) {
        
        int[] arr =  new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int st  =  Math.max(0,i - ranges[i]);
            int end = i+ranges[i];
            
        
            arr[st] = Math.max(arr[st],end);
        }
        
    //    for(int i:arr)
      //      System.out.println(i);
        
        int maxjump=0;
        int curjump=0;
        int num=0;
        
       int i=0;
        
        while(i<=n)
        {
            if(i==n)
                return num;
            
            maxjump =  Math.max(maxjump,arr[i]);
            
            if(curjump==i)
            {
                //System.out.println(i+" "+num+" "+curjump+" "+maxjump+" "+ranges[i]);
                num++;
                curjump = maxjump;
            }
            
            if(curjump==i)
                return -1;
            i++;
        }
        
        return -1;
        
    }
}
