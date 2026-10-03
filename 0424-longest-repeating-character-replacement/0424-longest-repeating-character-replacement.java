class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int j = 0;
        int maxi = 0;
        int maxf = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch - 'A']++;

            maxf = Math.max(maxf, freq[ch - 'A']);

            int windowLength = i - j + 1;

            int rep = windowLength - maxf;

            if (rep > k) {
                freq[s.charAt(j) - 'A']--;
                j++;
            }

            maxi = Math.max(maxi, i - j + 1);
        }

        return maxi;
    }
}