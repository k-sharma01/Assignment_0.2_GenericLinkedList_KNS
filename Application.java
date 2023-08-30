/**
 * This code tests the generic linked list
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Application 
{

	public static void main(String[] args) 
	{
		LinkedList<String> myList=new LinkedList<String>();
		
		Node<String> aNode=new Node<String>();
		aNode.setData("Data in first node");
		myList.addNode(aNode);
		
		aNode = new Node<String>();
		aNode.setData("Data in second node");
		myList.addNode(aNode);
		
		Node<String> tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		
	} // end main
	
} // end class
