class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sumDigits = 0;
            int temp = nums[i];
            while (temp > 0) {
                sumDigits += temp % 10;
                temp /= 10;
            }
            if (sumDigits == i) {
                return i;
            }
        }
        return -1;
    }
}