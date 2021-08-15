class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        int prev=nums[0]-1;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==prev)
            {i++;
                continue;
            }
            prev=nums[i];
            
            twosum(nums[i],list,0-nums[i],i+1,nums);
            i++;
        }
        
        
//         ArrayList<String> check = new ArrayList<String>();
//        for(int i=0;i<nums.length-2;i++)
//        {
//                    if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {

//            int el = nums[i];
//            int a = i+1;
//            int b = nums.length-1;
//           if(el>0)
//               break;
//            while(a<b)
//            {
              
//            if(nums[a]+nums[b]+el==0)
//            {
//                List<Integer> arrlist= new ArrayList<Integer>();
//                arrlist.add(nums[a]);
//                arrlist.add(nums[b]);
//                arrlist.add(el);
               
//                String str1 =""+nums[a]+nums[b]+el;
              
//                list.add(arrlist);
               
               
//                  while (a < b && nums[a] == nums[a+1]) a++;
//                     while (a < b && nums[b] == nums[b-1]) b--;
//                     a++; b--;
               
//            }
               
//               else if(nums[a]+nums[b]+el>0)
//               {
//                   b--;
//               }
//                else a++;
           
//        }
//        }
        
//        }
        return list;
        
    }
    
    
    public static void twosum(int add,List<List<Integer>> list ,int target,int start,int[] nums)
    {
        
        int i=start;
        int j=nums.length-1;
        
        while(i<j)
        {
            if(nums[i]+nums[j]==target)
            {
                List<Integer> l = new ArrayList<Integer>();
                l.add(add);
                l.add(nums[i]);
                l.add(nums[j]);
                if(!list.contains(l))
                list.add(l);
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>target)
                j--;
            else
                i++;
        }
        
        
    }
}