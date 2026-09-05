
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Build prefix maximum
        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Build suffix minimum
        suffixMin[n - 1] = nums[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            suffixMin[j] = Math.min(suffixMin[j + 1], nums[j]);
        }

        // Find first stable index
        for (int i = 0; i < n; i++) {
            int instability = prefixMax[i] - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }
}
