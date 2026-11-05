package Practic.linkedList;

public class kthNodeFromLast {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node forward = curr.next;
            curr.next = prev;
            prev = prev.next;
            curr = forward;
        }
        return prev;
    }

    // first approch...
    public int kthNode(Node head, int k){
        if(head==null || k<=0){
            return -1;
        }

        head = reverse(head);
        Node temp = head;
        for(int i=1; i<=k-1; i++){
            temp = temp.next;
        }

        return temp.data;
    }

    //2nd approch....
    public int kth_node(Node head, int k){
        if(head==null || k<=0){
            return -1;
        }
        Node curr = head;
        for(int i=1; i<=k; i++){
            curr = curr.next;
        }
        Node prev = head;
        while(curr!=null){
            curr = curr.next;
            prev = prev.next;
        }
        return prev.data;
    }
}
