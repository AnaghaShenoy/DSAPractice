/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        printInorder(ans, root);
        return ans;
    }
    
    void printInorder(ArrayList<Integer> ans, Node root) {
        if(root == null) {
            return;
        }
        printInorder(ans, root.left);
        ans.add(root.data);
        printInorder(ans, root.right);
    }
}
