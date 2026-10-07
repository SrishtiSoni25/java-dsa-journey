class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int nums : asteroids) {

            while (!st.isEmpty() && st.peek() > 0 && nums < 0) {

                int sum = nums + st.peek();

                if (sum < 0) {

                    st.pop();
                }
                else if (sum > 0) {
                    
                    nums = 0;
                }
                else {
                    
                    st.pop();
                    nums = 0;
                }
            }
            if (nums != 0) {
                st.push(nums);
            }
        }

        int[] res = new int[st.size()];
        int j = 0;

        for (int x : st) {
            res[j++] = x;
        }

        return res;
    }
}