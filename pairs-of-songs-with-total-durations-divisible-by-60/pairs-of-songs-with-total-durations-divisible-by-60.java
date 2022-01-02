class Solution {
    public int numPairsDivisibleBy60(int[] arr) {
   
        
        HashMap<Integer,Integer> h = new HashMap();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%60==0)
            {
                ans = ans + h.getOrDefault(0,0);
            }
            else
            {
                ans = ans + h.getOrDefault(60-(arr[i]%60),0);
            }
            
            h.put(arr[i]%60,h.getOrDefault(arr[i]%60,0)+1);
        }
        
        
        return ans;
        
    }
    
}