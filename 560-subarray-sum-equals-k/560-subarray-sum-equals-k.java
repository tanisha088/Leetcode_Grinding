class Solution {
    public int subarraySum(int[] arr, int k) {
        
    HashMap<Integer,Integer> h=  new HashMap();
        int sum = 0;
        h.put(0,1);
        int ans= 0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            ans+=h.getOrDefault(sum-k,0);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        
        return ans;
        
    }
}