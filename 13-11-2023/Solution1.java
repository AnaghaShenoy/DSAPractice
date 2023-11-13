// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        printPreorder(ans, root);
        return ans;
    }
    
    static void printPreorder(ArrayList<Integer> ans, Node root) {
        if(root == null) {
            return;
        }
        
        ans.add(root.data);
        printPreorder(ans, root.left);
        printPreorder(ans, root.right);
    }

}
