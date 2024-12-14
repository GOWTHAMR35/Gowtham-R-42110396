package trialanderror;

public class Queue {
	node front = null,rear = null;
	
	void enqueue(int d)
	{
		node n = new node();
		n.data = d;
		
		if (front==null)
		{
			front = n;
			rear = n;
		}
		else {
			rear.next = n;
			rear = n;
		}
	}
	int dequeue()
	{
		int a = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		return a;
	}
	
	int front()
	{
		return front.data;
	}
	boolean isempty()
	{
		return front == null;
	}
}
