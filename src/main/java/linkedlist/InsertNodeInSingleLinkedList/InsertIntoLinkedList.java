package linkedlist.InsertNodeInSingleLinkedList;

import linkedlist.Node;
import linkedlist.detectloopMethod2.LinkedList;

public class InsertIntoLinkedList {
    static Node head;
//Inserting data at the begining of the list
    static Node insertInLinkedList(Node head, int data,int position){
        int k=1;
        Node ptr1=null;
        Node ptr2=null;
        Node newNode=new Node(data);

        if(position==1){
            newNode.next=head;
            head=newNode;
        }

        return head;
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
        InsertIntoLinkedList list = new InsertIntoLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        System.out.println("Linked List before addition : ");
        list.printList(head);
        Node modifiedList=list.insertInLinkedList(head,40,1);
        System.out.println("Linked List after addition : ");
        list.printList(modifiedList);

    }


}
