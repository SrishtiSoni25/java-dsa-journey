class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer>stack=new Stack<>();
        // int score=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         st.push(score);
        //         score=0;
        //     }
        //     else{
        //         score=st.pop () +Math.max(score * 2,1);
        //     }
        // }
        // return score;
        stack.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }
            else{
                int val=stack.pop();
                int score=Math.max(2*val,1);
                stack.push(score+stack.pop());
            }
        }
        return stack.pop();
    }
}