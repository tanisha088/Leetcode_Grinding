class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
          
        if(nums1.length<nums2.length)
        {
            int[] t= nums1.clone();
            nums1 = nums2.clone();
            nums2 = t.clone();
        }
     //   System.out.println(nums1.length+" "+nums2.length+"*******");
        if(nums1.length==0 && nums2.length==0)
            return 0;
        else if(nums2.length==0)
        {
            if(nums1.length==1)
                return nums1[0];
            if(nums1.length%2==0)
            {
                return  Math.ceil ((nums1[(nums1.length/2) -1 ]+ nums1[nums1.length/2 ] )*1.0)/2;
            }
            else
                return nums1[nums1.length/2];
        }
      
     
        
        int tot= (nums1.length + nums2.length);
        
        int oddside =(int) Math.ceil ((nums1.length + nums2.length)*1.0 / 2);
        
        int lo = 0;
        int hi = nums2.length-1;
        
        int mid2= lo + (hi-lo)/2;
        
        int mid1 = oddside - (mid2+1) - 1 ;
        
       
      //  System.out.println(mid1+" "+mid2);
        while(mid1<nums1.length && mid2<nums2.length && mid2>=0)
        {
       //   System.out.println(mid1+" "+mid2+" "+nums1.length +" "+nums2.length);
            
            if((mid2<nums2.length-1 && nums1[mid1]>nums2[mid2+1]))
               {
                   mid2++;
                   mid1--;
               }
               
             else if(mid1<nums1.length-1 && nums2[mid2]>nums1[mid1+1])
            {
                 mid1++;
            mid2--;
                
            }
            else
            {
                 break;
            }
                
          
        }
       
        System.out.println(mid1+" "+mid2);
        
        
        double lmax= (mid2==-1?nums1[mid1]:(mid1==-1?nums2[mid2]:Math.max(nums1[mid1],nums2[mid2])));
        
 double  rmax = (mid2>=nums2.length-1?nums1[mid1+1]:(mid1>=nums1.length-1?nums2[mid2+1]:Math.min(nums1[mid1+1],nums2[mid2+1])));
        
           //    System.out.println(mid1+" "+mid2+" "+lmax+" "+rmax);

        
               if(tot%2==0)
                    return (lmax+rmax)/2;
                else
                    return lmax;
    }
}

// 1 2 5 6 7
// 3 7 8 11


// mid1 = 1  , el=2
    
// to be found = ceil (nums1.length + nums2.length) / 2 - el  = 2 
    
// mid2 = tbf - 1 
    
// mid1 < mid2 + 1 ->not -> mid1 ++ , mid2 -- 
// // mid2 < mid1 + 1 -> 
                                    
                                    
                                    
//                                   30 50
//                                    8  10