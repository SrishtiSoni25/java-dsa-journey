class Solution {

    public int buyChoco(int[] prices, int money) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < min) {
                max = min;
                min = price;
            }
            else if (price < max) {
                max = price;
            }
        }

        int total = min + max;

        if (total <= money) {
            return money - total;
        }

        return money;
    }
}