/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	    // Your code here	
	    Node temp = head;
	    if(x == 1) {
	        return head.next;
	    }
	    int count = 1;
	    while(temp.next != null) {
	        if(count >= x-1) {
	            temp.next = temp.next.next;
	            break;
	        }
	        else {
	            temp = temp.next;
	            count++;
	        }
	    }
	    
	    return head;
    }
}
