package Practic.linkedList;

public class removeDuplicates {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node removeDupli(Node head){
        if(head==null){
            System.out.println("empty list");
            return head;
        }
        if(head.next==null){
            return head;
        }

        Node curr = head;
        while(curr.next!=null){
            if(curr.data == curr.next.data){
                Node forward = curr.next.next;
                Node delete = curr.next;
                curr.next = forward;
                delete.next = null;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
