class Solution {
    public int nthUglyNumber(int n) {
    
        int[] arr=  new int[n];
        arr[0]=1;   
        
        int[] pointer =  new int[3];
        int i=1;
        while(i<n)
        {
            int min=Math.min(arr[pointer[0]]*2,Math.min(arr[pointer[1]]*3,arr[pointer[2]]*5));
            
            if(arr[pointer[0]]*2==min)
                pointer[0]++;
            
            if(arr[pointer[1]]*3==min)
                pointer[1]++;
            
            if(arr[pointer[2]]*5==min)
                pointer[2]++;
            
            arr[i++]=min;
        }
        
        return arr[arr.length-1];
    }
}