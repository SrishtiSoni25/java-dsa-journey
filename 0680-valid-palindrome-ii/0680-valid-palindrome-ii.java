class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPallindrome(s,left+1,right)||isPallindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
//return what function returns 
       public boolean isPallindrome(String s,int left,int right){
        while(left<right){
            //not = because why to check becuse it is pallindrome
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;
            }
            return true;
    

       }
}
//atmost-not necessary to remove
//brute -force-string reverse
//comparisosn-o(N2)