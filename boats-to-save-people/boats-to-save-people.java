class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        /*
        Arrays.sort(people);
        
        
        // 1 3 8 9
        
            int i=0;
        int j=people.length-1;
        int res=0;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
             i++;j--;res++;
            }
            else 
            {
                res++;
                j--;
            }
        }
        
        return res;
        */
        int res=0;
        
        int[] bucket=  new int[limit+2];
        
        for(int i:people)
            bucket[i]+=1;
        
        int sum=0;
        
        for(int i=0;i<bucket.length;i++)
        {
           int ns = bucket[i]+sum;
            bucket[i]=sum;
            sum=ns;
        }
        
        int[] arr = new int[people.length+1];
        for(int i=0;i<arr.length;i++)
            arr[i]=-1;
        for(int i=0;i<bucket.length-1;i++)
        {
            int st=bucket[i];
            int end=bucket[i+1];
            
           while(st<end)
               arr[st++]=i;
            
        }
        
        int i=0;
        int j=arr.length-1;
        
    //    for(int k=0;k<arr.length;k++)
      //      System.out.println(arr[k]);
        
        while(i<=j)
        {
            if(arr[i]==-1)
                i++;
            else if(arr[j]==-1)
                j--;
            else
            {
                if(arr[i]+arr[j]<=limit)
                {
                    res++;
                    i++;
                    j--;
                }
                else
                {
                    res++;
                    j--;
                }
                    
            }
        }
        
        return res;
    }
}









/*      
      0 
      1
      2 -0
      3 -1
      4 -3
      5 -3
      6 -3
      7 -3
      8 -4
      
      */