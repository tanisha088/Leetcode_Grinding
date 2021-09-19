class Solution {
      
    public class Job
    {
        int id;
        int deadline;
        int profit;
        
        Job(int id,int de,int prf)
        {
            this.id=id;
            this.deadline = de;
            this.profit=prf;
        }
    }
    
    public long maxTaxiEarnings(int n, int[][] rides) {
        
//                  Job[] arr =new Job[startTime.length];
//         for(int i=0;i<startTime.length;i++)
//         {
//             arr[i] = new Job(startTime[i],endTime[i],profit[i]);
            
//         }
 
    Job[] arr =new Job[rides.length];   
        
        for(int i=0;i<rides.length;i++)
        {
            arr[i]=  new Job(rides[i][0],rides[i][1],rides[i][1]-rides[i][0]+rides[i][2]);
        }
        
        Arrays.sort(arr,(a,b)->(a.deadline-b.deadline));
        
        long[] ans = new long[arr.length];
        long res=0;
        for(int i=0;i<arr.length;i++)
        {
            int prof =   bins(arr,0,i-1,i);
        //    System.out.println(prof+" "+i+"*******");
            if(prof==-1)
            {
                ans[i]= Math.max(res,arr[i].profit);
                res = ans[i];
                continue;
            }
            ans[i]  = arr[i].profit + ans[prof];
            
            res =Math.max(res,ans[i]);
            
            ans[i] = res;
          
        }
        
        return ans[ans.length-1];
    }
    
      public int bins(Job[] arr,int low,int high,int ind)
    {
        int ans=-1;
        
        while(low<=high)
        {
            int mid = low+(high-low)/2;
     
            
            if(arr[mid].deadline<=arr[ind].id)
            {
                ans = Math.max(ans,mid);
               
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        
        return ans;
            
    }
}


