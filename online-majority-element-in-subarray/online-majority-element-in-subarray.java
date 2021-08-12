    class MajorityChecker {
    Map<Integer, List<Integer>> map = new HashMap<>();
    int[] nums;
    public MajorityChecker(int[] arr) {
           for(int i=0;i<arr.length;i++){
               if(map.containsKey(arr[i])==false){
                   map.put(arr[i], new ArrayList<>());
               }
               map.get(arr[i]).add(i);
           }
           this.nums = arr;
    }
    
    public int lowestIndexSearch(List<Integer> list, int t){
         int i=0, j=list.size();
         while(i<j){
             int mid = (i+j)/2;
             if(list.get(mid)<t){
                  i=mid+1;
             }else{
                 j=mid;
             }
         }
        
        return i;
    }
    
    public int highestIndexSearch(List<Integer> list, int t){
        int i=0,j=list.size();
        while(i<j){
            int mid = (i+j)/2;
            if(list.get(mid)<=t){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        
        return i-1;
    }
    
    public int query(int left, int right, int threshold) {
          Random rand_gen = new Random();

          for(int i=0;i<20;i++){
              int rand_index = rand_gen.nextInt(right-left+1) + left;
              int num = this.nums[rand_index];
              
              int low_index = lowestIndexSearch(map.get(num), left);
              int high_index = highestIndexSearch(map.get(num), right);
              
              if(high_index-low_index+1>=threshold){

                  return num;
              }
          }
        
          return -1;
    }
    
}

/**
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);
 */


/**                                                              
 * Your MajorityChecker object will be instantiated and called as  such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);


 1 1 2 2 1 1 
 0,5 
 
 
 
 */


