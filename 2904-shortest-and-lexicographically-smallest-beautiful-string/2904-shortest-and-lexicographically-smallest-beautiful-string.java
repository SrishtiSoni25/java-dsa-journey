class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        int left = 0;
        int ones = 0;

        String result = "";

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            while (ones == k) {

                String temp = s.substring(left, right + 1);

                
                if (result.equals("") ||
                    temp.length() < result.length() ||
                    (temp.length() == result.length() && temp.compareTo(result) < 0)) {

                    result = temp;
                }

                
                if (s.charAt(left) == '1') {
                    ones--;
                }

                left++;
            }
        }

        return result;
    }
}