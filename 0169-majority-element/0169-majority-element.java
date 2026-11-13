class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr_element = nums[i];

            if (count == 0) {
                candidate = curr_element;
                count = 1;
            }
            else if (curr_element == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        return candidate;
    }
}