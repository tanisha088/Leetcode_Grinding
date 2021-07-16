class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int[] minsf = new int[arr.length];
        int[] maxsf  = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
            maxsf[i]=Math.max((i==0)?arr[0]:maxsf[i-1],arr[i]);
        
         for(int i=arr.length-1;i>=0;i--)
            minsf[i]=(i==arr.length-1)?arr[arr.length-1]:Math.min(minsf[i+1],arr[i+1]);
        
        int chunks=1;
       
        // 2 2 3 4 4 
        // 1 3 4 4 4 
        
        for(int i=0;i<arr.length-1;i++)
        {
           if(maxsf[i]<=minsf[i])
               chunks++;
        }
        
        
        return chunks;
    }
}


// 5 6 3 2 4 11 8 
// 2 3 4 5 6 8 11
// nlogn 
// 5

