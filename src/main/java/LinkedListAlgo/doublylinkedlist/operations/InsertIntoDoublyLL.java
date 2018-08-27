package LinkedListAlgo.doublylinkedlist.operations;

public class InsertIntoDoublyLL {
    // adding item at the beginning
    public static DLLNode insetAtBeginning(DLLNode head, int data) {
        if (head == null || head.next == null)
            System.out.println("List is empty or it is having only one element.");
        DLLNode newNode = new DLLNode(data, null);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    // adding item at the end of list
    public static DLLNode insertAtEnd(DLLNode head, int data) {
        //Creating a node out of the give value
        DLLNode lastNode = new DLLNode(data, null);
        //Linked list null check
        if (head == null || head.next == null)
            System.out.println("List is empty or it is having only one element.");
        DLLNode ptr1=head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = lastNode;
        lastNode.prev = head;
        lastNode.next = null;

        return ptr1;
    }
}
