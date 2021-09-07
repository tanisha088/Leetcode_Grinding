class Solution {
    public int maxChunksToSorted(int[] arr) {
        
//         int[] minsf = new int[arr.length];
//         int[] maxsf  = new int[arr.length];
        
//         for(int i=0;i<arr.length;i++)
//             maxsf[i]=Math.max((i==0)?arr[0]:maxsf[i-1],arr[i]);
        
//          for(int i=arr.length-1;i>=0;i--)
//             minsf[i]=(i==arr.length-1)?arr[arr.length-1]:Math.min(minsf[i+1],arr[i+1]);
        
//         int chunks=1;
       
//         // 2 2 3 4 4 
//         // 1 3 4 4 4 
        
//         for(int i=0;i<arr.length-1;i++)
//         {
//            if(maxsf[i]<=minsf[i])
//                chunks++;
//         }
        
        
//         return chunks;
          int[] a1=  new int[arr.length];
          int[] a2=  new int[arr.length];
        
        int max=arr[0];
        int min= arr[arr.length-1];
        a1[0]=max;
        a2[a2.length-1] =min;
        
        for(int i=1;i<arr.length;i++)
        {
            max = Math.max(arr[i],max);
            a1[i]=max;
        }
          for(int i=arr.length-2;i>=0;i--)
        {
            min = Math.min(arr[i],min);
            a2[i]=min;
        }
        
        int co=1;
        for(int i=0;i<arr.length-1;i++)
        {
        
            if(a1[i]<=a2[i+1])
                co++;

        }
        
        return co;
        
    }
}


// 2 2 4 4 4
// 1 1 3 3 4
