//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> ans = new ArrayList<>();
       printPreorder(ans, root);
       return ans;
    }
    
    void printPreorder(ArrayList<Integer> ans, Node root) {
        if(root == null) {
            return;
        }
        
        printPreorder(ans, root.left);
        printPreorder(ans, root.right);
        ans.add(root.data);
    }
}
