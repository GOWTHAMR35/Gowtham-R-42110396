package trialanderror;
class node
{
	int data;
	node next;
}
public class Stack {
	node top = null;
	
	void push(int d) 
	{
		node n = new node();
		n.data = d;
		if(top==null)
		{
			top = n;
		}
		else
		{
			n.next= top;
			top = n;			
		}
	}
	int pop()
	{
		int a = top.data;
		top = top.next;
		return a;
		
	}
	int peek()
	{
		return top.data;
	}
	boolean isempty()
	{
		return top == null;
	}
}
