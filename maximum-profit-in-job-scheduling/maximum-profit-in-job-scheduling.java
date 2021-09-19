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
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        
        //-------------------------------------------------------------------------------
        
//        Job[] array= new Job[endTime.length];
//         for(int i=0;i<startTime.length;i++)
//         {
//             Job j = new  Job(startTime[i],endTime[i],profit[i]);
//             array[i]=j;
//         }
        
//         Arrays.sort(array,(a,b)->(a.id-b.id));
//         return JobScheduling(array,array.length)[0];
//     }
//      int[] JobScheduling(Job arr[], int n){
//         // Your code here
        
//         int[] prof = new int[arr.length];
//         Job[] job = new Job[arr.length];
        
//         job[0]=arr[0];
//         prof[0]= arr[0].profit; 
//         int res=0;
//         int[] size = new int[arr.length];
//         for(int i=1;i<arr.length;i++)
//         {
//             int fn = bin(0,i-1,arr[i].id,arr);
//             int m=0;
//             if(fn!=0)
//               m=job[fn-1].profit;
//             Job h1 = new Job(arr[i].id,arr[i].deadline,(arr[i].profit+m));
            
//             job[fn]=h1;
//             prof[i]=arr[i].profit+m;
//             res=Math.max(res,fn);
//             size[i]=fn+1;
//         }
//         int[] ans = new int[arr.length];
//         int answer=0;
//         for(int i=0;i<prof.length;i++)
//         {
//         if(prof[i]>answer)
//         {
//             ans[0]=prof[i];
//             ans[1]=size[i];
//         }
//         }

//         return ans;
//     }
    
//     int bin(int st,int end,int el,Job[] job)
//     {
//         while(st<=end)
//         {
//             int mid = (st + (end-st)/2);
            
//             if(job[mid].deadline==el)
//             return mid+1;
            
//             if(job[mid].deadline > el)
//             end=mid-1;
//             else
//             st=mid+1;
//         }
        
//         return st;
        
        
        //--------------------------------------------------------------------------
        
        
  //      int[] startTime, int[] endTime, int[] profit
            
            Job[] arr =new Job[startTime.length];
        for(int i=0;i<startTime.length;i++)
        {
            arr[i] = new Job(startTime[i],endTime[i],profit[i]);
            
        }
        
        Arrays.sort(arr,(a,b)->(a.deadline-b.deadline));
        
        int[] ans = new int[arr.length];
        int res=0;
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
