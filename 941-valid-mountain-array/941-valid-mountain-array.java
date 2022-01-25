class Solution {
    public boolean validMountainArray(int[] arr) {
         
        int i=0;
    
        while(true)
        {
            while(i<arr.length-1 && arr[i]<arr[i+1])
                i++;
            
            if(i==0 || i==arr.length-1)
                return false;
            
            while(i<arr.length-1 && arr[i]>arr[i+1])
                i++;
            
            
            if(i==arr.length-1)
                return true;
            
             return false;
        }
       
        
    }
}