class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        int l=s.length();
        int ans=0;
        if(l==0 || l==1){
            return 0;
        }
        st.push(-1);
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }
                else{
                    ans=Math.max(ans,i-st.peek());
                }
            }
        }
        return ans;
        
    }
}