class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (isPallindrome(s, i, j)) {
                    if ((j - i + 1) > result.length()) {//pallindromic length and previously saved 
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }

        return result;
    }

    private boolean isPallindrome(String s, int left, int right) {
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}