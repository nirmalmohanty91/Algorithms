package linkedlist.LinkedListOperations;

public class DeletingInLinkedList {

    //Deleting Fist node
    public static Node deleteFirstNode(Node head){
        if(head ==null || head.next==null)
            System.out.println("List is empty/Only one element is present");
        head=head.next;
        return head;
    }
    //Deleting the las node
    public static Node deleteLastNode(Node head){
        if(head ==null || head.next==null)
            System.out.println("List is empty/Only one element is present");

        Node ptr1=head;
        Node ptr2=null;
        while(ptr1.next!=null){
            ptr2=ptr1;
            ptr1=ptr1.next;
        }
        ptr2.next=null;
    return head;
    }
    //Deleting from middle
    public static Node deleteFromPosition(Node head,int position){
        if(head ==null || head.next==null)
            System.out.println("List is empty/Only one element is present");
if(position==1){
    return head=deleteFirstNode(head);

    } else {
      Node ptr1 = head;
      Node ptr2 = null;
      int k = 1;

      while (ptr1.next != null && position > k) {
        k++;
        ptr2 = ptr1;
        ptr1 = ptr1.next;
      }
      ptr2.next = ptr1.next;
      return head;
        }
    }
}
