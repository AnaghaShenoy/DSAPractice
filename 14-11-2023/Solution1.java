/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        printLevelorder(ans, node);
        return ans;
    }
    
    static void printLevelorder(ArrayList<Integer> ans, Node node) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            ans.add(temp.data);
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}



