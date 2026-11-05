package Practic.linkedList;

public class Old_even_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Old_even_LL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //1st approach
    public void odd_even(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node oddHead = head;
        Node oddTail = head;

        Node evenHead = head.next;
        Node evenTail = head.next;

        while (evenTail!=null && evenTail.next!=null) {
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
            
        }

        oddTail.next = evenHead;
        //return oddHead;
    }

    //second approch
    public void oddEven(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node dummy = new Node(-1);
        Node ansHead = dummy;
        Node ansTail = dummy;

        //odd position terms
        Node temp = head;
        while(temp!=null){
            ansTail.next = temp;
            ansTail = temp;
            temp = (temp.next !=null) ? temp.next.next : null;
        }

        //even position terms
        temp = head.next;
        while(temp!=null){
            ansTail.next = temp;
            ansTail = temp;
            temp = (temp.next !=null) ? temp.next.next : null;
        }

        ansHead = ansHead.next;
        dummy.next = null;

       // return ansHead.data;
    }

    //traverse
    public void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Old_even_LL myList = new Old_even_LL();
        Node head = new Node(10);
        myList.head = head;
        Node first = new Node(20);
        head.next = first;
        Node second = new Node(30);
        first.next = second;
       
        myList.oddEven(head);
        myList.traverse();

    }
}
