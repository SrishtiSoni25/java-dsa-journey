
class Solution {
    public int minMoves(int[] nums) {
        int open = 0;
        int maxEl = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxEl = Math.max(maxEl, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            open += maxEl - nums[i];
        }

        return open;
    }
}
