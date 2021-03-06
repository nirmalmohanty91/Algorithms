package singlylinkedlist;

import singlylinkedlist.operations.*;

public class DriverProgram {
  static Node head;
  static int i;

  // Driver Program to test all linked-list operations
  public static void main(String[] args) {
    DriverProgram list = new DriverProgram();
    // Inserting data into linked list
    list.head = new Node(50);
    list.head.next = new Node(20);
    list.head.next.next = new Node(15);
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(10);

    // Printing Linked List
    System.out.println("Linked List items before any operation: ");
    PrintLinkedList.printList(head);

    //    // Creating a loop for testing
    //    head.next.next.next.next.next = head.next.next;
    //
    //    //Detecting and removing loop 1st Approach
    //    i= DetectAndRemoveLoop1.detectAndRemoveLoop(head);
    //    if(i==1){
    //      System.out.println("Loop detected and removed!");
    //    }
    //    System.out.println(DetectAndRemoveLoop1.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    // Creating a loop for testing
    //    head.next.next.next.next.next = head.next.next;
    //
    //    //Detecting and removing loop 2nd Approach
    //     i= DetectAndRemoveLoop2.detectAndRemoveLoop(head);
    //    if(i==1){
    //      System.out.println("Loop detected and removed!");
    //    }
    //    System.out.println(DetectAndRemoveLoop2.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    // Creating a loop for testing
    //    head.next.next.next.next.next = head.next.next;
    //
    //    // Detecting and removing loop Final Approach
    //    DetectAndRemoveLoopFinal.detectAndRemoveLoop(head);
    //    System.out.println(DetectAndRemoveLoopFinal.class+" after removing loop : ");
    //    PrintLinkedList.printList(head);
    //
    //    System.out.println("List at the beginning: ");
    //    PrintLinkedList.printList(head);
    //
    //    Node modifiedList = InsertIntoLinkedList.insertInLinkedList(head, 40, 1);
    //    System.out.println("After inserting data to the 1st position : ");
    //    PrintLinkedList.printList(modifiedList);

    //    Node insertInMiddle = InsertIntoLinkedList.insertInLinkedList(head, 80, 4);
    //    System.out.println("After inserting in middle : ");
    //    PrintLinkedList.printList(insertInMiddle);
    //
    //    System.out.println("Inserting at the end : ");
    //    Node insertAtEnd = InsertIntoLinkedList.insetAtEnd(head, 820);
    //    PrintLinkedList.printList(insertAtEnd);
    //    head=DeletingInLinkedList.deleteFirstNode(head);
    //    System.out.println("After deleting 1st node : ");
    //    PrintLinkedList.printList(head);
    head = DeletingInLinkedList.deleteFromPosition(head, 5);
    System.out.println("After from position node : ");
    PrintLinkedList.printList(head);
  }
}
