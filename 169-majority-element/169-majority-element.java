class Solution {
    public int majorityElement(int[] nums) {
        
        int num = nums[0];
        int co  = 1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=num)
            {
                co--;
            }
            else
                co++;
            if(co==0)
            {
                num = nums[i];
                co=1;
            }
        }
        
        return num;
        
        
//        /*
//         int fp=0;
      
//         int fc=0;
        
//         for(int i=0;i<nums.length;i++)
//         {
//           if(fc==0 || fp==nums[i])
//           {
//               fp=nums[i];
//               fc++;
//           }
//             else
//             {
//                 fc--;
//             }
//         }
        
//         return fp;
//         */
        
// //         int v=nums[0];
// //         int c=1;
        
// //         for(int i=0;i<nums.length;i++)
// //         {
// //             if(nums[i]==v)
// //                 c++;
// //             else
// //                 c--;
// //             if(c==0)
// //             {
// //                 v=nums[i];
// //                 c=1;
// //             }
// //         }
        
// //         return v;
        
        
// //         int v=nums[0];
// //         int c=1;
// //         int c2=0;
        
// //         for(int i=1;i<nums.length;i++)
// //         {
// //             if(nums[i]==v)
// //             {
// //               c++;
// //             }
// //             else
// //                 c2++;
            
// //             if(c2>=c)
// //             {
// //                 v= nums[i];
// //                 c= c2
// //             }
// //         }
        
// //         return v;
        
//         int value=nums[0];
//         int count=1;
        
//         for(int i=1;i<nums.length;i++)
//         {
//             if(value==nums[i])
//                 count++;
//             else
//             {
//                 if(count==0)
//                 {
//                     value = nums[i];
//                     count = 1;
//                 }
//                 else
//                 {
//                     count--;
//                 }
//             }
//         }
        
//         return value;
     }
}

       
       
       