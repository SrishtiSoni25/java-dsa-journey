class Solution {
    public String simplifyPath(String path) {

        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String i : arr) {
            if (i.equals(".") || i.equals("")) {
                continue;
            }

            
            if (i.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

        
            else {
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String i : stack) {
            sb.append("/");
            sb.append(i);
        }

        if (sb.length() == 0) {
            return "/";
        }

        return sb.toString();
    }
}