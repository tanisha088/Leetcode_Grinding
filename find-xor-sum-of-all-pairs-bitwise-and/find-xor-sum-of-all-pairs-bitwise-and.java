class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
         int [] counter1 = new int[32];
    int [] counter2 = new int[32];
    
    for(int i=0;i<arr1.length;i++){
        
        int curr = arr1[i];
        for(int j=0;j<31;j++){
            if((curr & (1<<j) )!= 0){
                counter1[j]++;
            }
        }
        
    }
    
    for(int i=0;i<arr2.length;i++){
        
        int curr = arr2[i];
        for(int j=0;j<31;j++){
            if((curr & (1<<j))!= 0){
                counter2[j]++;
            }
        }
        
    }
    int ans = 0;
    for(int i=0;i<31;i++){
        int mul = ( (counter1[i]) * (counter2[i]) )% 2;
        if(mul % 2 != 0){
            ans = ans | 1<<i;
        }
    }
    return ans; 
    }
}