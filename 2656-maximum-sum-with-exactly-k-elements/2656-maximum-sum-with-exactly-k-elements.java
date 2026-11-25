class Solution {
    public int maximizeSum(int[] nums, int k) {
         int maxValue = 0;
        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }
        return k * maxValue + k * (k - 1) / 2;
    }
}
