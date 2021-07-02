class Solution {
    public int numTimesAllBlue(int[] light) {
        
        
        int ans=0;
        int min=Integer.MAX_VALUE;
        int max=-1;
        for(int i=0;i<light.length;i++)
        {
            min =Math.min(light[i],min);
            max=Math.max(light[i],max);
            if(max-min==i && min==1)
                ans++;
        }
        
        return ans;
        
    }
}

/*
 
 x  1->x  max-min = index and min=1

*/

