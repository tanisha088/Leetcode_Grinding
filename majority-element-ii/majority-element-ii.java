class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int c1=1;
        int c2=0;
        int v1=nums[0];
        int v2=0;
        int i=1;
                List<Integer> list = new ArrayList<Integer>();

        while(i<nums.length && nums[i]==v1)
        {
            c1++;
            i++;
        }
        if(i==nums.length)
           {list.add(v1); return list;}
        v2 = nums[i];
        c2++;
        i++;
        while(i<nums.length && nums[i]==v2)
        {
            c2++;
            i++;
        }
             System.out.println(v1+" "+v2+" "+c1+" "+c2+" "+i);
        while(i<nums.length)
        {
            
          if(nums[i]==v1 || nums[i]==v2)
          {
              if(nums[i]==v1)
                  c1++;
              else c2++;
          }
            else 
            {  
                if(c1==0 || c2==0)
            {
                    if(c1==0)
               { v1= nums[i];
                c1++;}
                    else if(c2==0)
                    { v2= nums[i];
                c2++;}
            }
            
            else
            {
                c1--;
                c2--;
            }
            }
           i++;
        }
        
       
        
        c1=0;
        c2=0;
        
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==v1)
                c1++;
            else if(nums[i]==v2)
                c2++;
        }
            
        int lim = (int)(Math.floor((nums.length*1.0)/3));
        if(c1 > lim)
        list.add(v1);
        if(c2>lim)
            list.add(v2);
        
        return list;
    }
}