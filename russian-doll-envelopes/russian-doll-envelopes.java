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
    }
}