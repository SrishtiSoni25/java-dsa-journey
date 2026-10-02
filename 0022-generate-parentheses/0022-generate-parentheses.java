// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> result = new ArrayList<>();
//         backtrack(result, "", 0, 0, n);
//         return result;
        
//     }
//     private void backtrack(List<String> result, String current, int open, int close, int n){
//         if(current.length() == 2 * n) {
//             result.add(current);
//             return;
//         }
//         if (open < n) {
//             backtrack(result, current + "(", open + 1, close, n);
//         }
//         if(close < open) {
//             backtrack(result, current +")", open, close + 1, n);
//         }
//     }
// }
class Solution {
    List<String> valid = new ArrayList<>();

    public void generate(String s, int open, int close) {

        
        if (open == 0 && close == 0) {
            valid.add(s);
            return;
        }

        if (open > 0) {
            generate(s + "(", open - 1, close);
        }
        if (close > 0) {
            if (open < close) {
                generate(s + ")", open, close - 1);
            }
        }
    }

    public List<String> generateParenthesis(int n) {
        generate("", n, n);
        return valid;
    }
}