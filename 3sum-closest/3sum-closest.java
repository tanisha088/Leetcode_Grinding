class Solution {
    public int threeSumClosest(int[] nums, int target) {
     
        Arrays.sort(nums);
         
    int dis =Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length-2;i++)
       {
                   if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {

           int el = nums[i];
           int a = i+1;
           int b = nums.length-1;

           while(a<b)
           {
              int s1 = nums[a]+nums[b]+el;
               System.out.println(nums[a]+" "+nums[b]+" "+el);
           if(s1==target)
           {
               return target;
           }
               
               else if(s1>target)
              {
                  int dif = s1-target;
                   if(dif<dis)
                   {
                       ans=s1;
                       dis = dif;
                   }
                  b--;
              }
               else 
               {
                 int dif = target-s1;
                   if(dif<dis)
                   {
                       ans=s1;
                       dis = dif;
                   }
                  a++;
               }
           
       }
       }
        
       }
        return ans;
    }
}