class Solution {
    public int longestMountain(int[] arr) {
        
        int i=0;
        int res=0;
        while(i<arr.length)
        {
            int st =i;
            int s1 =i;
            while(i<arr.length-1 && arr[i+1]>arr[i])
                i++;
            
            if(i-st<1)
            {
                i++;
                continue;
            }
            
            st = i;
            System.out.println(st);
            while(i<arr.length-1 && arr[i]>arr[i+1])
                i++;
            
            if(i-st<1)
                continue;
            System.out.println(i+" "+s1);
            res=Math.max(res,i-s1+1);
        }
        
        return res;
    }
}