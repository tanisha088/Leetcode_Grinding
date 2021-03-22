class Solution {
    public boolean isHappy(int n) {
        
        List<Integer> l =new ArrayList<Integer>();
        int sum=0;
        while(true)
        {
            int m = n;
            sum=0;
            while(m!=0)
            {
                sum = sum + (m%10)*(m%10);
                m/=10;
            }
          
            n = sum;
            
            if(sum==1)
                return true;
            if(l.contains(sum))
                return false;
                
                        l.add(sum);

        }
        
    }
}