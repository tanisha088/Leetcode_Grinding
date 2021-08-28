class Solution {
    public long maxAlternatingSum(int[] nums) {
         long odd = 0, even = 0;
        for (int a: nums) {
            even = Math.max(even, odd + a);
            odd = Math.max(odd,even - a);
        }
        return even;
    }
}

/*

+6 -4 -3 +5 

6 5 3 4

*/