class Solution {
    public boolean checkString(String s) {
         boolean seen=false;
        for(int i=0;i<s.length();i++){
           
                char c=s.charAt(i);
                if(c=='b'){
                    seen= true;
                }
                else if(seen){
                    return false;
                }
            }
            return true;

            
        }
}