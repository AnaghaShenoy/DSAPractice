// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long[] ans = new long[sum+1];
        ans[0] = 1;
        
        for(int i: coins) {
            for(int j=i; j<=sum; j++) {
                ans[j] += ans[j-i];
            }
        }
        
        return ans[sum];
    }
}
