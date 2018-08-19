package doublylinkedlist.operations;

public class PrintingDoublyLL {

    public static void printDoublyLL(DLLNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
