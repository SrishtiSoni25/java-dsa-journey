class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        int mod = 1000000007;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int ans = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (s.charAt(i) != s.charAt(j)) {
                    dp[i] = (dp[i] + dp[j]) % mod;
                }
            }

            ans = (ans + dp[i]) % mod;
        }

        return ans;
    }
}