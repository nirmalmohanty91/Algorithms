package singlylinkedlist.LinkedListOperations;

public class PrintLinkedList {

    // Method to print the linked list
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
