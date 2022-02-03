class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        HashMap<Integer,Integer> h = new HashMap();
        
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        
        int tot = 0;
        
        for(int i=0;i<C.length;i++)
            for(int j=0;j<D.length;j++)
            h.put(D[i]+C[j],h.getOrDefault(D[i]+C[j],0)+1);
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                int sum =  A[i]+B[j];
                    if(h.containsKey(0-sum))
                        tot+=h.get(0-sum);
            }
        }
        
        return tot;
        
        
        
    }
}


