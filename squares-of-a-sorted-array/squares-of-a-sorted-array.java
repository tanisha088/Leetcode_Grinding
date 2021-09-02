class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=  new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int c=0;
        while(i<=j)
        {
            int a = nums[i];
            int b = nums[j];
            if(Math.abs(a)>Math.abs(b))
            {
                res[c] = a*a;
           i++;
            }
            else { res[c] = b*b; j--;}
            c++;
                
            
            
        }
        
        i=0;
        j=nums.length-1;
        
        while(i<j)
        {
            int t=res[i];
            res[i]=res[j];
            res[j]=t;
            i++;
            j--;
        }
        
        return res;
    }
}