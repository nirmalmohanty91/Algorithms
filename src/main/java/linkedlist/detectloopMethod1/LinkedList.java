package linkedlist.detectloopMethod1;

import linkedlist.Node;

public class LinkedList {
  static Node head;

  // Function that detects loop in the list
  int detectAndRemoveLoop(Node node) {
    Node slow = node;
    Node fast = node;

    while (slow != null && fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        removeLoop(slow, node);
        return 1;
      }
    }
    return 0;
  }

  // Function that removes loop
  void removeLoop(Node loop, Node curr) {
    Node ptr1 = null;
    Node ptr2 = null;

    // Set a pointer to the beginning of the linked list and move it one by one to find the first
    // node which is part of the Linked List
    ptr1 = curr;
    while (1 == 1) {
      // Now start a pointer from loop_node and check if it ever reaches ptr2
      ptr2 = loop;
      while (ptr2.next != loop && ptr2.next != ptr1) {
        ptr2 = ptr2.next;
      }
      /* If ptr2 reahced ptr1 then there is a loop. So break the
      loop */
      if (ptr2.next == ptr1) {
        break;
      }

      /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
      ptr1 = ptr1.next;
    }

    /* After the end of loop ptr2 is the last node of the loop. So
    make next of ptr2 as NULL */
    ptr2.next = null;
  }

  // Function to print the linked list
  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }


    // Driver program to test above functions
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        System.out.println("Linked List before removing loop : ");
        list.printList(head);
        System.out.println();
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        //Detecting and removing loop
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
}
