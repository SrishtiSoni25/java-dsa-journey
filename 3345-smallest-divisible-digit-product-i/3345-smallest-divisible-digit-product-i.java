class Solution {
    
    public int smallestNumber(int n, int t) {
        for (int c = n; ; c++) {
            
            int dp = 1;
            int temp = c;
        
            while (temp > 0) {
                int lastDigit = temp % 10;  
                dp *= lastDigit;         
                temp /= 10;                   
            }
            if (dp% t == 0) {
                return c;
            }
        }
    }
}