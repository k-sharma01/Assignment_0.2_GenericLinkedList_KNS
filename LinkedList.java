/**
 * This code represents a linked list
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class LinkedList<T> 
{

	Node<T> head; // holds a reference to the first node in linked list
	int length; // holds the length of the linked list
	Node<T> tail; // holds a reference to the last node in linked list
	
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	} // end constructor
	
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	} // end isEmpty
	
	public Node<T> getList()
	{
		return head;
	} // end getList
	
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	} // end addNode
	
} // end class
