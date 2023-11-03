//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        int s = 0;
        int e = k;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(s < e && e <= n) {
            int max = arr[s];
            for(int i=s; i<e; i++) {
                max = Math.max(max, arr[i]);
            }
            ans.add(max);
            s++;
            e++;
        }
        
        return ans;
    }
}
