class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int max=0;
        int chunk=1;
        
        for(int i=0;i<arr.length-1;i++)
        {
            max=Math.max(arr[i],max);
            if(i==max)
                chunk++;
        }
        
        return chunk;
    }
}