package LinkedList;

public class doublyCircularLL {
    static  class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    doublyCircularLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //insertion
    //insert at head
    public void insertHead(int num){
        Node newNode = new Node(num);
        if(head==null && tail==null){
            head = newNode;
            tail=newNode;
            head.prev = tail;
            tail.next = head;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = tail;
            tail.next = head;
        }
        size++;
    }

    //insert at tail
    public void insertTail(int num){
        Node newNode = new Node(num);
        if(head==null && tail==null){
            head = newNode;
            tail=newNode;
            head.prev = tail;
            tail.next = head;
        }else{
            Node temp = head;
            for(int i=1; i<=size-1;i++){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    //insert at position
    public void insertPos(int pos, int data){
        Node newNode = new Node(data);
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            insertHead(data);
            return;
        }
        if(pos==size+1){
            insertTail(data);
            return;
        }
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        Node forward = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = forward;
        forward.prev = newNode;
        size++;
    }


    //searching
    public boolean search(int num){
        if(head==null){
            System.out.println("empty list");
            return false;
        }
        Node temp = head;
        do{
            if(temp.data==num){
                return true;
            }
            temp = temp.next;
        }while(temp!=head);
        return false;
    }


    //deletion
    //delete from head
    public void deleteHead(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head==tail){
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head.next;
        head.prev = null;
        head = temp;
        tail.next = head;
        size--;

    }

    //delete tail
    public void deleteTail(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head==tail){
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = tail.prev;
        tail.next = null;
        temp.next = head;
        tail = temp;
        head.prev = tail;
        size--;
    }

    // delete from position
    public void deletePos(int pos){
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            deleteHead();
            return;
        }
        if(pos==size+1){
            deleteTail();
            return;
        }
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        Node forward = temp.next.next;
        Node curr = temp.next;
        curr.prev = null;
        curr.next = null;
        temp.next = forward;
        forward.prev = temp;
        size--;

    }

    //traversal and printing list
    public void printList(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp!=head);

        System.out.println();
    }


    public static void main(String[] args) {
        doublyCircularLL myList = new doublyCircularLL();
        myList.insertHead(10);
        myList.insertHead(20);
        myList.insertTail(99);
        myList.insertTail(77);
        myList.printList();
        myList.insertPos(3, 1);
        myList.printList();
        //System.out.println("1 (found or not) : " + myList.search(1));
        myList.deleteHead();
        myList.printList();

        // myList.deleteHead();
        // myList.printList();

        // myList.deleteTail();
        // myList.printList();

        // myList.deleteTail();
        // myList.printList();

        // myList.deleteTail();
        // myList.printList();

        myList.deletePos(3);
        myList.printList();

        myList.deletePos(1);
        myList.printList();

        myList.deletePos(2);
        myList.printList();
    }
}
