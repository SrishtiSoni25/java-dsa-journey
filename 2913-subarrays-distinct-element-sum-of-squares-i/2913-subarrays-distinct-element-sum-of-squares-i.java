
class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;
        int size = nums.size();

        for (int left = 0; left < size; left++) {
            int[] freq = new int[101];
            int unique = 0;

            for (int right = left; right < size; right++) {
                int value = nums.get(right);

                freq[value]++;

                if (freq[value] == 1) {
                    unique++;
                }

                result += unique * unique;
            }
        }

        return result;
    }
}
