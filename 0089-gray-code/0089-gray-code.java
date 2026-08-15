class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int bit = 0; bit < n; bit++) {

            int size = result.size();

            for (int i = size - 1; i >= 0; i--) {
                result.add(result.get(i) + (1 << bit));
            }
        }

        return result;
    }
}