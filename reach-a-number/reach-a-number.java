class Solution {
    public int reachNumber(int target1) {
        
        long target = (long)(target1);
       target=Math.abs(target);
            long val = (long) Math.ceil(((-1 + (Math.sqrt(1+8*target)))/2));
        
        long target2  = (val*(val+1))/2;
        
        long diff =  target2 - target;
        
        if(diff%2==0 && diff/2<=val)
            return (int)val;
        
        val+=1;
        target2  = (val*(val+1))/2;
        
         diff =  target2 - target;
        
        if(diff%2==0 && diff/2<=val)
            return (int)val;
        
        return (int)(val+1);
    }
}

