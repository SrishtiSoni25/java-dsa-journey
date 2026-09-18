class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++){
            if(s.substring(0,s.length()-i).equals(rev.substring(i))){
                //prefix in s==suffix in rev
        return rev.substring(0,i)+s;
    }
    }
    return rev+s;
}
}