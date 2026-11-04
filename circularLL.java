package LinkedList;

public class circularLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    circularLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //insert at head
    public void insertHead(int data){
        Node newNode = new Node(data);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    //insert at tail
    public void insertTail(int data){
        Node newNode = new Node(data);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    //insert at position
    public void insertPos(int pos, int data){
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
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        Node curr = temp.next;
        temp.next = newNode;
        newNode.next = curr;
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

    //traversal and printing the list
    public void printList(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp!=head);

        System.out.println();
    }


    // deletion
    // delete head
    public void deleteHead(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }

    // delete tail
    public void deleteTail(){
        if(tail==null){
            System.out.println("empty list");
            return;
        }
        if(head==tail){
            head=tail=null;
            size = 0;
            return;
        }
        Node temp = head;
        for(int i=1; i<=size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        tail.next = head;
        size--;
    }

    //delete position
    public void deletePos(int pos){
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            deleteHead();
        }
        if(pos==size+1){
            deleteTail();
        }
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        circularLL myList = new circularLL();
        myList.insertHead(15);
        myList.insertHead(19);
        myList.insertTail(20);
        myList.insertPos(2, 99);
        myList.printList();
       // System.out.println("19 (found or not) : " + myList.search(19));
        // myList.deleteHead();
        // myList.printList();

        // myList.deleteTail();
        // myList.printList();
        
        myList.deletePos(2);
        myList.printList();

    }
}
