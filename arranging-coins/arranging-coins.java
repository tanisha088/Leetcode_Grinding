class Solution {
    public int arrangeCoins(int n) {
        long j =  (long)n;
       System.out.println(Math.pow(2,31)-1);
        return (int)(Math.floor(((-1+Math.sqrt(1+8*j))/2)));
        
        
    }
}

