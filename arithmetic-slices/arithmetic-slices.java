class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int i=0;
        int j=i+1;
        int res=0;
        while(j<=nums.length-1)
        {
            int di = nums[i]-nums[j];
            while(j<nums.length-1)
            {
                if(nums[j]-nums[j+1]!=di)
                    break;
                j++;
            }
            
        int len = j-i+1;
            i=j;
            j=i+1;
            if(len<=2)
                continue;
    //        System.out.println(i+" "+j);
            res=res+ (len-2)*len + (len-2) - ((((len)*(len+1))/2)-3);
        }
        
        return res;
    }
}