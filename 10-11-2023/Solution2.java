

/*
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       Node temp = head;
       int n = 1;
       
       while(temp.next != null) {
           temp = temp.next;
           n++;
       }
       
       temp = head;
       
       int ind = (int)Math.ceil((double)n/k);
       int count = 1;
       
       if(ind > n) {
           return -1;
       }
       
       while(temp.next != null) {
           if(count == ind) {
               break;
           }
           temp = temp.next;
           count++;
       }
       
       return temp.data;
    }
}
