public class SinglyLinkedList
{	
	private static ListNode Head;
	private static class ListNode
	{
		private int data;
		private ListNode Next;

		public ListNode(int data)
		{
		  this.data= data;
		  this.Next= null;
		}
		
	}


	public void Display()
	{
		ListNode current = Head;
		while(current != null)
		{
		    System.out.print(current.data+"===>");
		    current = current.Next;
		}
		System.out.println("null");
	}

	public void length()
	{
		int count = 0;
		ListNode current= Head;
		while(current!=null)
		{
		    count++;
		    current =current.Next; 
		}
		System.out.println("count");
	}

	public void insertAtBeginning(int data)
	{
		ListNode newNode = new ListNode(data);
		newNode.Next = Head;
		Head = newNode;
	}

	public void insertAtLast(int data)
	{
		ListNode newNode = new ListNode(data);
		if(Head == null)
		{
			Head = newNode;
			return;
		}
		ListNode currNode = Head;
		while(currNode.Next != null)
		{
			currNode = currNode.Next;
		}

		currNode.Next = newNode;		
	}

	
   
     	
	public static void main(String[] args)
	{
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.Head = new ListNode(10);
		ListNode sec = new ListNode(20);
		ListNode thi = new ListNode(30);
		ListNode fou = new ListNode(40);

		//Connections
		obj.Head.Next = sec;
		sec.Next = thi;
		thi.Next = fou;

		obj.Display();
		obj.length();
		obj.insertAtBeginning(5);
		obj.Display();
		obj.insertAtLast(100);
		obj.Display();

	}
    
}