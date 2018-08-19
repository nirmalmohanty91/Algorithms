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
        if (head == null || head.next == null)
            System.out.println("List is empty or it is having only one element.");
        DLLNode ptr1;
        while (head.next != null) {
            ptr1 = head;
            head = head.next;
        }

        return null;
    }
}
