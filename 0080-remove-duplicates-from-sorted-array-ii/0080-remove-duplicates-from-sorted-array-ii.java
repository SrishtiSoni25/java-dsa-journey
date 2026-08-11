class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for (int currentNum : nums) {
            if (uniqueIndex < 2 || currentNum != nums[uniqueIndex - 2]) {
        
                nums[uniqueIndex] = currentNum;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
