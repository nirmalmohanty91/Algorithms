package linkedlist.LinkedListOperations;

public class InsertIntoLinkedList {

  public static Node insertInLinkedList(Node head, int data, int position) {
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
    }

    return head;
  }
  //Insert at the end
  public static Node insetAtEnd(Node head, int data) {
    Node newNode = new Node(data);
    if(head==null) return newNode;
    Node current=head;
    while (current.next != null) {
      current=current.next;
    }
    current.next=newNode;
    return head;
  }


}
