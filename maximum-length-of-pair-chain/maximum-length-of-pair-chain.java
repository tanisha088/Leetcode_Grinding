class Solution {
    
    class Pair
    {
        int a;
        int b;
        Pair(int a ,int b)
        {
            this.a =a;
            this.b =b;
        }
    }
    
    public int findLongestChain(int[][] pairs) {
        
        Pair[] p= new Pair[pairs.length];
        for(int i=0;i<pairs.length;i++)
        {
            Pair p1 = new Pair(pairs[i][0],pairs[i][1]);
            p[i]=p1;
        }
        
        Arrays.sort(p,(a,b)->(a.a-b.a));
        
        int[] arr= new int[p.length];
        int res=0;
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(p[j].b<p[i].a)
                {
                    arr[i] = Math.max(arr[i],arr[j]+1);
                    res=Math.max(arr[i],res);
                }
            }
        }
        
        
        return res+1;
        
        
    }
}