class Solution {
    public int uniquePaths(int m, int n) {
 
        int[] arr=  new int[n+1];
        
        Arrays.fill(arr,1);
        arr[0] = 0;
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<=n;j++)
            arr[j] = arr[j] + arr[j-1];
        }
        
        return arr[n];
        
    }
    
}

//0 1 1 1
 // 1 2 3