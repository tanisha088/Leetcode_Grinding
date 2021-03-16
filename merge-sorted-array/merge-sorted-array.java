class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
          int i=0;
        int j=0;
        
        while(i<m && j<n)
        {
            if(arr1[i]>arr2[j])
            {
                int t=arr2[j];
                arr2[j]=arr1[i];
                arr1[i]=t;
                
                int j1 = j+1;
                while(j1<arr2.length && arr2[j1]<arr2[j])
                {
                    t = arr2[j];
                    arr2[j]=arr2[j1];
                    arr2[j1]=t;
                    j++;
                    j1++;
                }
                j=0;
            }
            i++;
        }
        
        for(i=m;i<n+m;i++)
        {
            arr1[i]=arr2[i-m];
        }

      //  for(i=0;i<arr1.length;i++)
        //    System.out.print(arr1[i]+" ");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
        
        System.out.println();
        
}
}