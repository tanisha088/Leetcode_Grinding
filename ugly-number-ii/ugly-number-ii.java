class Solution {
    public int nthUglyNumber(int n) {
        
        int a=2;
            int b=3;
            int c=5;
          int t0=1;
        int t1=1;
        int t2=1;
        
    
        
        int[] arr= new int[n+1];
        
        arr[1]=1;
        
        
        
        for(int i=2;i<=n;i++)
        {
            int m = Math.min(arr[t0]*a ,Math.min(arr[t1]*b,arr[t2]*c));
            if(m==arr[t0]*a && m==arr[t1]*b && m==arr[t2]*c)
            {
                t0++;
                t1++;
                t2++;
            }
            else if(m==arr[t0]*a && m==arr[t1]*b)
            {
                t0++;
                t1++;
            }
            else if(m==arr[t0]*a && m==arr[t2]*c)
            {
                t0++;
                t2++;
            }
            else if(m==arr[t2]*c && m==arr[t1]*b)
            {
                t2++;
                t1++;
            }
            else if(m==arr[t0]*a)
                t0++;
            else if(m==arr[t1]*b)
                t1++;
            else if(m==arr[t2]*c)
                t2++;
            
            arr[i]=m; 
        }
        for(int j=0;j<arr.length;j++)
            System.out.println(arr[j]);
        return arr[n];
    }
}