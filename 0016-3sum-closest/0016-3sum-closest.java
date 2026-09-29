class Solution {
    public int threeSumClosest(int[] nums, int target) {
    //    Arrays.sort(nums);
       int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<Math.abs(result-target)){
                        result=sum;
                    }
                    if(sum==target){
                        return target;
                    }
                }
                

            }
        }
        return result;
    }
}