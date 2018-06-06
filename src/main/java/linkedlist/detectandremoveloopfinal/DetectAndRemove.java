package linkedlist.detectandremoveloopfinal;

import linkedlist.Node;

public class DetectAndRemove {

  public static void printList(Node node) {
    if (node.next == null) return;

    while (node.next != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void detectAndRemoveLoop(Node node) {
    Node slow = node;
    Node fast = node;

    if (node == null || node.next == null) {
        System.out.println("List is empty/Have only one element in it.");
        return;
    }

    slow = node.next;
    fast = fast.next.next;

    while (fast != null && fast.next != null) {
      if (slow == fast) break;
      slow = slow.next;
      fast = fast.next.next;
    }
    // If loop exists
    if (fast == slow) {
      slow = node;
      while (slow.next != fast.next) {
        fast = fast.next;
        slow = slow.next;
      }
      fast.next=null;
    }
  }

  public static void main(String[] args) {
    // inserting data into linked list
    Node node = new Node(50);
    node.next = new Node(20);
    node.next.next = new Node(15);
    node.next.next.next = new Node(4);
    node.next.next.next.next = new Node(5);

    System.out.println("Printing before looping: ");
    printList(node);

    //node.next.next.next.next.next = node.next.next;
    detectAndRemoveLoop(node);
    System.out.println("Printing after removing looping:");
    printList(node);

  }
}
