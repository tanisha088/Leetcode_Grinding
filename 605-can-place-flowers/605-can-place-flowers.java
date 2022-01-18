class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
         int i=0;
        while(i<flowerbed.length && flowerbed[i]==0)
            i++;
        
        int len = 0;
        if(i==flowerbed.length)
            return (i+1)/2 >=n ?true:false;
        len = len + i/2;
        
        while(i<flowerbed.length)
        {
            int in = i;
            i++;
            while(i<flowerbed.length && flowerbed[i]==0)
                i++;
            
            if(i==flowerbed.length)
                len= len + (i-in-1)/2;
            else
            len = len + (i-in)/2 -1;
            
        }
        
        return len>=n?true:false;
    }
}