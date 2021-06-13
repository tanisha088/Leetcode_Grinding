class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        ArrayList<String> check = new ArrayList<String>();
       for(int i=0;i<nums.length-2;i++)
       {
                   if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {

           int el = nums[i];
           int a = i+1;
           int b = nums.length-1;
          if(el>0)
              break;
           while(a<b)
           {
              
           if(nums[a]+nums[b]+el==0)
           {
               List<Integer> arrlist= new ArrayList<Integer>();
               arrlist.add(nums[a]);
               arrlist.add(nums[b]);
               arrlist.add(el);
               
               String str1 =""+nums[a]+nums[b]+el;
              
               list.add(arrlist);
               
               
                 while (a < b && nums[a] == nums[a+1]) a++;
                    while (a < b && nums[b] == nums[b-1]) b--;
                    a++; b--;
               
           }
               
              else if(nums[a]+nums[b]+el>0)
              {
                  b--;
              }
               else a++;
           
       }
       }
        
       }
        return list;
        
    }
}