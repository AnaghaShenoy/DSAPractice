//User function Template for Java

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int low = 0;
        int high = n-1;
        int mid;
        while(low <= high) {
            mid = (low + high) / 2;
            if(( mid == 0 || arr[mid] > arr[mid-1] ) && ( mid==n-1 || arr[mid] > arr[mid+1] ) ) {
                return arr[mid];
            }
            else if(mid < n-1 && arr[mid] < arr[mid+1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
