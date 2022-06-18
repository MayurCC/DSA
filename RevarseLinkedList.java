

public class RevarseLinkedList 
{
    static Node head1;
    static class Node
    {
       int data1;
       Node nex;

       Node(int d1)
       {
        data1 = d1;
        nex = null;

       }   
    }

    Node reverselist(Node node1)
    {
        Node previous = null;
        Node curr = node1;
        Node nex = null;

        while(curr != null)
        {
            nex = curr.nex;
            curr.nex = previous;
            previous = curr;
            curr = nex;
        }

        node1 = previous;
        return node1;
    }
    

    public static void main(String [] args)
    {
        
    }
}
