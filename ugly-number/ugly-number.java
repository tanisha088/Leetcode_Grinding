class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        n = Math.abs(n);
        
        if(n==1 || n==2 || n==3 || n==5)
            return true;
        
        if(n%2==0)
            return isUgly(n/2);
        else if(n%3==0)
            return isUgly(n/3);
        else if(n%5==0)
            return isUgly(n/5);
        else
            return false;
    }
    
}