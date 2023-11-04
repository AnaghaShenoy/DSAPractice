class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int n = a.length();
        int m = b.length();
        
        if(n != m) {
            return false;
        }
        
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<n; i++) {
            if(A[i] != B[i]) {
                return false;
            }
        }
        
        return true;

    }
}
