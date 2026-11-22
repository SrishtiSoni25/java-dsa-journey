
class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] ans = new String[n];

        int aliceCount = 0;
        int bobCount = 0;

        for (int i = 0; i < n; i++) {

            boolean alice = (i < n - 1) && (rain[i] == 1) && (rain[i + 1] == 1);
            boolean bob = (rain[i] == 1);

            if (!alice && !bob) {
                ans[i] = "None";
            }
            else if (alice && bob) {

                if (aliceCount <= bobCount) {
                    ans[i] = "Alice";
                    aliceCount++;
                }
                else {
                    ans[i] = "Bob";
                    bobCount++;
                }
            }
            else if (bob) {
                ans[i] = "Bob";
                bobCount++;
            }
            else {
                ans[i] = "Alice";
                aliceCount++;
            }
        }

        return ans;
    }
}
