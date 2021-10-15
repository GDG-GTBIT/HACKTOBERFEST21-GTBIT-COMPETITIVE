public class DoublylinkedlistInsertionatgivenposition {
    // Question Link
    // https://practice.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
    
        
    //  Structure of Doubly Linked List
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node newnode = new Node(data);
		int count=0;
		Node curr = head_ref;
		while(count<pos)
		{
		    count++;
		    curr = curr.next;
		}
		newnode.next = curr.next;
		if(newnode.next!=null)
		newnode.next.prev = newnode;
		newnode.prev = curr;
		curr.next = newnode;
	}
}
