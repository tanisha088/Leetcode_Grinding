class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double lo=0;
        double hi=1;
        int[] ans = new int[2];
        while(true)
        {
            double mid = lo + (hi-lo)/2;
            
            int res=0;
            int j=1;
            int[] arr1 = new int[2];
            arr1[0]=-1;
            for(int i=0;i<arr.length-1;i++)
            {
                while(j<arr.length && arr[i]>mid*arr[j])
                    j++;
                
                res=res+arr.length-j;
                  if(j==arr.length)
                 break;
            System.out.println(arr[i]+" "+arr[j]+" "+arr1[0]+" "+arr1[1]);
                if(arr1[0]==-1 || (arr1[0]*arr[j]<arr1[1]*arr[i]))
                {
                arr1[0]=arr[i];
                    arr1[1]=arr[j];
                }
            }
            
            if(res==k)
                return arr1;
            if(res>k)
            {
                hi= mid;
            }
            else
                lo =mid;
            
        }
        
    }
}