class Solution {
    public List<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        int i= 0 ;
        List<String> ll =  new ArrayList();
        while(i<nums.length)
        {
            StringBuilder bs = new StringBuilder("");
            bs.append(nums[i]);
             i++;
            int j =  i;
            while(i<nums.length && nums[i]==nums[i-1]+1)
                i++;
          if(i!=j)
            {
                bs.append("->");
                bs.append(nums[i-1]);
            }
            ll.add(bs.toString());
        }
        return ll;
    }
}

