class Solution {
    public int countNegatives(int[][] grid) {
        
        
        
//         int j=grid[0].length-1;
//       int res=0;
//         for(int i=0;i<grid.length;i++)
//         {
//             // 1st approach===>
//            // int in = bs(grid[i],grid[0].length-1,0,0-0.5);
//          //   System.out.println(i+"****");
//             int in = fn(grid[i],grid[0].length-1,0,0);
//             res=res+grid[0].length-in;
//         }
        
//         return res;
        
        
       int j=grid[0].length-1;
        int count=0;
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            while(j>=0)
            {
                if(grid[i][j]>=0)
                    break;
                else
                    count++;
                j--;
            }
            
            ans = ans + count;
        }
        
        return ans;
        
}
  
    public int fn(int[] arr,int lo,int hi,int t)
    {
        while(hi<lo)
        {
            int mid= hi + (lo-hi)/2;
            if(arr[mid]>=t)
                hi=mid+1;
            else
                lo=mid;
        }
     
        System.out.println(hi);
        return hi;
    }
    
    
    /*
     int low =0;
        int high = arr.length-1;
        while (low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= 0){
                low  = mid+1;
            }else{
                high = mid;
            }
        }
        return arr[low] > -1 ? -1 : low;
    */
    
    /*
    while (start <= end) {
				int mid = (start + end) / 2;
				if (grid[i][mid] < 0) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			c = c + grid[i].length - start;
    */
    
    /*
    public int bs(int[] arr,int lo,int hi,double t)
    {
        while(hi<=lo)
        {
            int mid= lo + (hi-lo)/2;
            if((double)arr[mid]>t)
                hi=mid+1;
            else
                lo=mid-1;
        }
     
        System.out.println(hi);
        return hi;
    }
    
    */
}