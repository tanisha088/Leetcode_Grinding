class Solution {
    public int findUnsortedSubarray(int[] A) {
        
// In this what we do is that we will try to see the best subarray such that the beg and end are pointing to places wherein the values after the end are are all increasing , and those before the beginiing are all increasing,so what we will do is ,since we want a straight increasing line, we will find the max at each point and then see that if this point is greater than the maximum or not, if it is then okay , else mark the end=i , since after this point since this did not happen , this means that all of those satisfy that after them only their increased value is coming. Now, in order to find begining, all values lesser than that should be less than the current value. So , at every index we will find the minimum at each point from the end, and at every point, if the current element is greater than the minimum till now, that will mean any element prev to it, will always to lesser than the minimum till that point and hence sorted. So we got the beg and end of the unsorted array.
        
           int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i=1;i<n;i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);
      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i; 
    }
    return end - beg + 1;
    }
}

// 1. sort -> O(n)
// 2. bucket sort -> O(max(nums[i])
// 3. 
