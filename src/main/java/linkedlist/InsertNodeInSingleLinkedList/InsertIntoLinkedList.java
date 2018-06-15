package linkedlist.InsertNodeInSingleLinkedList;

import linkedlist.Node;

public class InsertIntoLinkedList {
  static Node head;

  static Node insertInLinkedList(Node head, int data, int position) {
    int k = 1;
    Node ptr1 = null;
    Node ptr2 = null;
    Node newNode = new Node(data);
    ptr1 = head;
    // Inserting data at the beginning of the list
    if (position == 1) {
      newNode.next = ptr1;
      head = newNode;
    } else {
      // Traverse the list until the position where we want to insert
      while ((ptr1 != null) && position > k) {
        k++;
        ptr2 = ptr1;
        ptr1 = ptr1.next;
      }
      ptr2.next = newNode;
      newNode.next = ptr1;
      head = ptr2;
    }

    return head;
  }
  //Insert at the end
  public Node insetAtEnd(Node head, int data) {
    Node newNode = new Node(data);
    if(head==null) return newNode;
    Node current=head;
    while (current.next != null) {
      current=current.next;
    }
    current.next=newNode;
    return head;
  }

  // Function to print the linked list
  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  // Driver program to test above functions
  public static void main(String[] args) {
    InsertIntoLinkedList list = new InsertIntoLinkedList();
    list.head = new Node(50);
   list.head.next = new Node(20);
    list.head.next.next = new Node(15);
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(10);
    System.out.println("Linked List before addition : ");
    list.printList(head);
    Node modifiedList = list.insertInLinkedList(head, 40, 1);
    System.out.println("After inserting data to the 1st position : ");
    list.printList(modifiedList);
    Node insertInMiddle = list.insertInLinkedList(head, 80, 2);
    System.out.println("After inserting in middle : ");
    list.printList(insertInMiddle);
    System.out.println("Inserting at the end : ");
    Node insertAtEnd = list.insetAtEnd(head, 820);
    list.printList(insertAtEnd);
  }
}
