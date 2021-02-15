class Solution {
    
    class Pair
    {
        int a ;
        int b;
        Pair(int a ,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Pair> pq=  new PriorityQueue<Pair>((a,b)->((a.b!=b.b)?(b.b-a.b):(b.a-a.a)));
        
        // BS TOTALLY SAME IN THIS ALSO - JUST THE DIFF IS OF THE FACT THAT PHLE JAISE ON OBTAINING  SMALL MID VALUE YOU GO TO LEFT NOW YOU GO TO RIGHT - SO SINCE PHLE IF NO>RIGHT BOUNDARY -> ANS=ARR.LENGTH SO NOW IF ANS<VALUE AT BOUNDARY.LENGTH => ANS->ARRAY.LENGTH. 
        for(int i=0;i<mat.length;i++)
        {
            int lo=0;
            int hi=mat[0].length-1;
            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;
                if(mat[i][mid]>0)
                    lo=mid+1;
                else
                    hi=mid-1;
            }
            Pair p= new Pair(i,hi);
            pq.add(p);
            if(pq.size()>k)
                pq.remove();
            
        }
        int[] arr= new int[k];
        int i=arr.length-1;
        while(!pq.isEmpty())
            arr[i--]=pq.poll().a;
        return arr;
        
    }
}