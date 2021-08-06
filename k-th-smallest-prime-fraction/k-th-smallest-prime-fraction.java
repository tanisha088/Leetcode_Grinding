class Solution {
    
    public class Pair
    {
        int a;
        int b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
// 1ST APPROACH - USING BS 
        // 2ND APPROACH - USING PRIORITY QUEUE
        /*
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
        
        */
 //***********************************************************************************************
      //  2ND APPROACH -----
        
//         PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(arr[a.a]*arr[b.b]-arr[a.b]*arr[b.a]));
        
//         for(int j=arr.length-1;j>0;j--)
//         {
//             Pair p =  new Pair(0,j);
//             pq.add(p);
//         }
        
//         while(k!=1)
//         {
//             Pair p = pq.poll();
//             int a = p.a;
//             int b = p.b;
//             a=a+1;
//             k--;
//             if(a>=b)
//                 continue;
//             pq.add(new Pair(a,b));
//         }
        
//         int[] ans = new int[2];
//         Pair p1 =pq.peek();
//         ans[0]=arr[p1.a];
//         ans[1]=arr[p1.b];
        
        
//         return ans;
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(arr[a.a]*arr[b.b] - arr[b.a]*arr[a.b]));
        
        for(int i=1;i<arr.length;i++)
            pq.add(new Pair(0,i));
        
        for(int i=0;i<k-1;i++)
        {
            Pair p1 = pq.remove();
            if(p1.a +1 < p1.b)
            {
                pq.add(new Pair(p1.a+1,p1.b));
            }
        }
        
        return new int[]{arr[pq.peek().a],arr[pq.peek().b]};
    }
}