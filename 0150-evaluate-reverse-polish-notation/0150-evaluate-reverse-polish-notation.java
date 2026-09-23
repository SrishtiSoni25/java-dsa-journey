class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            else {

                if (stack.isEmpty()) {
                    return 0;
                }

                int b = stack.pop();

                if (stack.isEmpty()) {
                    return 0;
                }

                int a = stack.pop();

                if (token.equals("+")) {
                    stack.push(a + b);
                }

                else if (token.equals("-")) {
                    stack.push(a - b);
                }

                else if (token.equals("*")) {
                    stack.push(a * b);
                }

                else if (token.equals("/")) {
                    stack.push(a / b);
                }
            }
        }

        if (stack.isEmpty()) {
            return 0;
        }

        return stack.peek();
    }
}