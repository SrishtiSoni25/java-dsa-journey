class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

       Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

       for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) continue;  

            if(nums[i] + 1 == nums[i + 1]){
                count++;  
            }
            else if(nums[i] != nums[i + 1]) {
                maxCount = Math.max(count, maxCount);
                count = 1; 
            }
       }
    
    
       maxCount = Math.max(count, maxCount);
       return maxCount;
    }
}