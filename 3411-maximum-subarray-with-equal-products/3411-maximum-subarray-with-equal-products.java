// class Solution {
//     public int gcd(int a,int b){
//         return b==0?a:gcd(b,a%b);
//     }
//     public int lcm(int a, int b) {
//         return (a / gcd(a, b)) * b;
//     }
//         public int maxLength(int[] nums) {
//             for(int i=0;i<nums.length;i++){
//            int ans=0;
//            for(int j=i+1;j<nums.length;j++){
//             prod*=nums[j];
//             g=gcd(g,nums[j]);
//             l=lcm(l,nums[j]);
//            if(prod=l**g){
//             maxLen=Math.max(maxLen,j-i+1);
//            }
//             }
//             }
//             return maxLen;
// }
// }
class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length;i++){
            int prod=nums[i];
            int GCD=nums[i];
            int LCM=nums[i];
            for(int j=i+1;j<nums.length; j++){
                prod*=nums[j];
                GCD=gcd(GCD,nums[j]);
                LCM=(LCM*nums[j])/gcd(LCM,nums[j]);

                if(prod==GCD*LCM){
                    ans=Math.max(ans,j-i+1);
                }
                if(prod>GCD*LCM)
                break;
            }

        }
        return ans; 
    }
    public int gcd(int a, int b){
        return b==0?a:gcd(b,a%b);
    }
}

