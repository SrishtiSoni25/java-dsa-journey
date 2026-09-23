class Solution {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        int sum = 0;

        int takeOnes = Math.min(k, numOnes);

        sum += takeOnes;
        k -= takeOnes;

        int takeZeros = Math.min(k, numZeros);

        k -= takeZeros;

        sum -= k;

        return sum;
    }
}