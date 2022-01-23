class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        
        long num = lower;
        long min = lower;
        long max=  lower;
        for(int i=0;i<differences.length;i++)
        {
            num =  num + differences[i];
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        
        max = max + (lower-min);
        
        return (int)(Math.max(0,upper-max+1));
    }
}

//1,2,-1,3
