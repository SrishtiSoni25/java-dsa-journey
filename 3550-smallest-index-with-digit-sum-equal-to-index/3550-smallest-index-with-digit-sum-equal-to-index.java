class Solution {

    public int smallestIndex(int[] nums) {
     int n = nums.length;
     for (int i = 0; i < n; i++) {
        int s = 0;
            int num = nums[i];

            while (num > 0) {
                int r = num % 10;
                s += r;
                num /= 10;
            }

            if (s == i)
                return i;
        }

        return -1;
    }
}