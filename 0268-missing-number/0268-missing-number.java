class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int x: nums){
            sum += x;
        }
        int total_sum = n*(n+1)/2;

        return total_sum-sum;
    }
}