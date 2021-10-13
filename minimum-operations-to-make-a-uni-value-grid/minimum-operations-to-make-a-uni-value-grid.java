class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length*grid[0].length];
        int i=0;
          HashSet<Integer> odd = new HashSet();
        HashSet<Integer> even =  new HashSet();
        for(int[] a:grid)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]%2==0)
                    even.add(a[j]);
                else
                    odd.add(a[j]);
                arr[i++]=a[j];
            }
        }
        
        Arrays.sort(arr);
        
        if(odd.size()==0 || even.size()==0 || x%2!=0 )
        {
            int val = arr[(arr.length-1)/2];
            int tots=0;
            
            for(i=0;i<arr.length;i++)
            {
                tots+=(Math.abs(val-arr[i])/x);
                
                if(Math.abs(val-arr[i])%x!=0)
                    return -1;
            }
            
            return tots;
        }
        
        return -1;
        
      
    }
}