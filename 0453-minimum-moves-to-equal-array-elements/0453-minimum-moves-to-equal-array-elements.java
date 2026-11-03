
class Solution {
    public int minMoves(int[] nums) {
        int minEl = Integer.MAX_VALUE;
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            minEl = Math.min(minEl, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - minEl;
        }

        return moves;
    }
}
