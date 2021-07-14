class Solution {
    public int minNumberOperations(int[] target) {
        
     
      int prev=0;
        int ans=0;
       int i=0;
        while(i<target.length)
        {
            int max=target[i];
            
            while(i<target.length-1 && target[i]<target[i+1])
            {
                max=Math.max(target[i+1],max);
                i++;
            }
            while(i<target.length-1 && target[i]>=target[i+1])
            {
                 max=Math.max(target[i],max);
                i++;
            }
            
            ans += (max-prev);
            prev = target[i];
            i++;
        }
        return ans;
    }
}


// 1 2 3 2 1  ,  arr[i]>=arr[i+1] , i++ , ans+=i ,  i+=1  
// 0 0 4 4 3 4 0 0