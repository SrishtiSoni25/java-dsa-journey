
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int i = 0;
        int count = 0;
        int result = 0;

        while (i < n) {
            if (s.charAt(i) == '(') {
                count++;
                i++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    result++;
                    i++;
                }

                if (count > 0) {
                    count--;
                } else {
                    result++;
                }
            }
        }

        return result + count * 2;
    }
}