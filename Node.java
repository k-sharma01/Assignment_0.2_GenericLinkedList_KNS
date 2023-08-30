/**
 * This code represents a generic node for a linked list
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Node<T>
{

	T data; // holds the data in the node of type T
	Node<T> nextNode; // holds reference to the next node
	
	public Node()
	{
		nextNode=null;
		data=null;
	} // end constructor
	
	public void setData(T data) 
	{
		this.data=data;
	} // end setData
	
	public Node<T> getNode() 
	{
		return this;
	} // end getNode
	
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	} // end setNextNode
	
} // end class
