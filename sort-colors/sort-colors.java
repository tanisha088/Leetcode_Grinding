class Solution {
    public void sortColors(int[] A) {
     
        int i=0;
        int j=0;
        
        int k=A.length-1;
        
        while(k>=0 && A[k]==2)
            k--;
        
        
      while(j<=k)
      {
        if(A[j]==0)
        {
            int m =  A[i];
            A[i]=A[j];
            A[j]=m;
            i++;
            j++;
        }
        else if(A[j]==2)
        {
            int m  = A[k];
            A[k]=A[j];
            A[j]=m;
            k--;
        }
        else 
            j++;
      }
        
        /*
        0 1  2 0   i=0 j=0 k=2 
        
        */
        
    }
}