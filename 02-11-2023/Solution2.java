// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int ans = 0;
        for(int x: array) {
            ans = ans^x;
        }
        
        for(int i=1; i<=n; i++) {
            ans = ans^i;
        }
        
        return ans;
       
    }
}
