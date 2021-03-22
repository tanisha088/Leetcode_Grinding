class Solution {
    public int addDigits(int num) {
        
      while(true)
      {
          if(num<10)
              return num;
          
          int ans =0;
          
          while(num!=0)
          {
              ans = ans + num%10;
              num/=10;
              
          }
          
        num = ans;
      }
        
    }
}