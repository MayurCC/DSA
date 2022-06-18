//Special Operations In DSA To Get ==> Add,Delete,Print,Size

public class SinglyLinkedListDemo
{
    private static Node head;
    private int size; //create variable

    SinglyLinkedListDemo() //class cha constructor create kela
    {
        this.size = 0;
    }
    
    class Node
    {
        String Data;
        Node next;
        

        Node(String Data) //creating constructor
        {
            this.Data = Data;
            this.next = null; //By default Null
            size++;
        }

    
    }
        // Add = First
        public void AddFirst(String Data) //Creating a function
        {
            Node newNode = new Node(Data);
            if(head == null)
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //Add = Last
        public void AddLast(String Data) //creating a function
        {
            Node newNode = new Node(Data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}

		currNode.next = newNode;		
	}

      //PrintList
    public void printList()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.Data + "==>");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    //Deletefirst
    public void Deletefirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next; //deleteFirst Node

    }

    //DeleteLast
    public void DeleteLast()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        //Traverse the node
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next; //updating
            secondLast = secondLast.next; //updating
        }

        secondLast.next = null;
    }

    //Length or Size track
    public int Getsize()
    {
        return size;
    }
      
      
    
        public static void main(String [] args)
        {
            SinglyLinkedListDemo list = new SinglyLinkedListDemo(); // Initialized object of SinglyLinkedListDemo class 
            
            list.AddFirst("a");
            list.AddFirst("is");
            list.printList();

            list.AddLast("list");
            list.printList();

            list.AddFirst("this");
            list.printList();

            list.Deletefirst();
            list.printList();

            list.DeleteLast();
            list.printList();

           System.out.println(list.Getsize()); 

           list.AddFirst("this");
           list.printList();

           System.out.println(list.Getsize()); 




        }
    
}
    
   




    
