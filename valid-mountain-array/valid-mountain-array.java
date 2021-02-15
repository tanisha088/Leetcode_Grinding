class Solution {
    public boolean validMountainArray(int[] arr) {
         int i=0;
        int j=arr.length-1;
        while(i<j && arr[i]<arr[i +1])
            i++;
            while(j>i && arr[j]<arr[j -1])
                j--;
                System.out.println(j);
                if(j==i && i!=0 && j!=arr.length-1)
                    return true;
        
        return false;
    }
}