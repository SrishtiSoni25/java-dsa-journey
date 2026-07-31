class Solution {
    public int minimumPushes(String word) {
        Integer[] charCount = new Integer[26];
        Arrays.fill(charCount, 0);

        for (char ch : word.toCharArray()) {
            charCount[ch - 'a']++;
        }

        Arrays.sort(charCount, Collections.reverseOrder());

        int c = 0;
        for (int i = 0; i < 26; i++) {
            c += charCount[i] * (i / 8 + 1);
        }

        return c;
    }
}