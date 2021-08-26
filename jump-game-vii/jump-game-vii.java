class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
  //      &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        
       // https://leetcode.com/problems/jump-game-vii/discuss/1230326/Java-or-Full-explanation%3A-Brute-Force-O(n2)-DP-greater-O(n)-Partial-Sum-greater-O(n)-Sliding-Window 
        
     //   *********************************************************
        
//    I-MIN - (I-MAX)-1 >=0  -> TRUE  ELSE FALSE
             
//             1  0  
//             F
//             0
            
            if(s.charAt(s.length()-1)=='1')
                return false;
            int[] psum = new int[s.length()];
            if(s.charAt(0)=='0')
                 psum[0]+=1;
        int st=1;
        s = s.substring(1,s.length());
        for(char c:s.toCharArray())
        {
           if(c=='1')
                psum[st]=psum[st-1];
            else
            {
                int val=0;
                if(st-minJump<0)
                   val=0;
                else if(st-maxJump<=0)
                {
                    val = (psum[st-minJump]>0?1:0);
                }
                else
                {
                    val = (psum[st-minJump]-psum[st-maxJump-1])>0?1:0;
                }
                if(st==s.length())
                    return val==1?true:false;
                psum[st]=psum[st-1]+val;
                
            //    System.out.println(val+" "+st+" "+s.length());
            }

            st++;
        }
        
        
        return false;
            
    }
}