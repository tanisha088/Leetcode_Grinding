class Solution {
    public int findJudge(int n, int[][] trust) {
            if(n==1)
                return 1;
        int[] arr = new int[n+1];
        HashSet<Integer> set =  new HashSet<Integer>();
        
        for(int i=0;i<trust.length;i++)
        {
            arr[trust[i][1]]+=1;
            set.add(trust[i][0]);
        }
        for(int i=1;i<arr.length;i++)
            if(arr[i]==(n-1) && !set.contains(i))
                return i;
        
        return -1;
    }
}