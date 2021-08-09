class Solution {
 public int thirdMax(int[] nums) {
        // INT max1 = null;
        // Integer max2 = null;
        // Integer max3 = null;
        // for (Integer n : nums) {
        //     if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
        //     if (max1 == null || n > max1) {
        //         max3 = max2;
        //         max2 = max1;
        //         max1 = n;
        //     } else if (max2 == null || n > max2) {
        //         max3 = max2;
        //         max2 = n;
        //     } else if (max3 == null || n > max3) {
        //         max3 = n;
        //     }
        // }
        // return max3 == null ? max1 : max3;
     
     long max1=Long.MIN_VALUE;
     long max2=Long.MIN_VALUE;
     long max3=Long.MIN_VALUE;
    
     
     for(int i:nums)
     {
         if((i==max1 ) || (i==max2) || (i==max3))
             continue;
         if(max1==Long.MIN_VALUE || i>max1)
         {
             max3=  max2;
             max2= max1;
             max1=  i;

         }
         else if(max2==Long.MIN_VALUE || i>max2)
         {
             max3= max2;
             max2 = i;

         }
         else if(max3==Long.MIN_VALUE|| i>max3)
         {
             max3= i;
         }
         
         
     }
     return (max3==Long.MIN_VALUE)?(int)max1:(int)max3;
    }
}