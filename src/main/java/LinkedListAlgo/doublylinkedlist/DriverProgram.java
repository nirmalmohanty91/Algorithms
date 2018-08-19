package LinkedListAlgo.doublylinkedlist;

import LinkedListAlgo.doublylinkedlist.operations.DLLNode;
import LinkedListAlgo.doublylinkedlist.operations.InsertIntoDoublyLL;
import LinkedListAlgo.doublylinkedlist.operations.PrintingDoublyLL;

public class DriverProgram {
  static DLLNode head;

  public static void main(String[] args) {
    DriverProgram list = new DriverProgram();
    list.head = new DLLNode(10, null);
    list.head.next = new DLLNode(20, list.head);
    list.head.next.next = new DLLNode(30, list.head.next);
    list.head.next.next.next = new DLLNode(40, list.head.next.next);
    list.head.next.next.next.next = new DLLNode(50, list.head.next.next.next);
//Printing list
    PrintingDoublyLL.printDoublyLL(head);
    //Insert at beginning of the list
    DLLNode modifiedList= InsertIntoDoublyLL.insetAtBeginning(head,5);
    PrintingDoublyLL.printDoublyLL(modifiedList);





  }
}

