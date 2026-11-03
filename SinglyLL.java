package LinkedList;

public class SinglyLL {
    static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public SinglyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //insert at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //insert at tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
        }else{
            // Node temp = head;
            // while(temp.next!=null){
            //     temp = temp.next;
            // }
            // temp.next = newNode;
            // tail = newNode;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //insert at given position
    public void insertPos(int pos, int data){
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            insertAtHead(data);
            return;
        }
        if(pos==size+1){
            insertAtTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
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

    //size of linked list
    public int getSize(){
        return size;
    }

    //get head
    public int getHead(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    //get tail
    public int getTail(){
        if(tail==null){
            return -1;
        }
        return tail.data;
    }

    //check if empty
    public boolean isEmpty(){
        if(head==null || tail==null){
            return true;
        }
        return false;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    //searching a number
    public boolean search(int n){
        Node temp = head;
        while(temp!=null){
            if(temp.data==n){
                return true;
            }else{
                temp=temp.next;
            }
        }
        return false;
    }

    //find position of target value
    public int findPos(int n){
        Node temp = head;
        int pos = 1;
        while(temp!=null){
            if(temp.data==n){
                return pos;
            }else{
                temp = temp.next;
                pos++;
            }
        }
        return -1;
    }

    //updation using position
    public void updateAtPos(int pos, int n){
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        Node temp = head;
        for(int i=1; i<=pos-1; i++){
            temp = temp.next;
        }
        temp.data = n;
    }

    //update by value
    public void updateByValue(int value, int newData){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                temp.data = newData;
            }
            temp = temp.next;
        }
    }

    //deletion
    //delete head
    public void deleteHead(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        head = head.next;
        size--;
        if(head==null){
            tail=null;
        }
    }

    // delete tail
    public void deleteTail(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head==tail){
            head = tail = null;
            size = 0;
        }
        Node temp = head;
        for(int i=1; i<=size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    //delete at position
    public void deletePos(int pos){
        if(pos<1 || pos>size+1){
            System.out.println("invalid position");
            return;
        }
        Node temp = head;
        for(int i=0; i<=pos-2; i++){
            if(i==pos-2){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
       
    }


    public static void main(String[] args) {
        SinglyLL myList = new SinglyLL();
        myList.insertAtHead(10);
        myList.insertAtTail(30);
        myList.insertPos(2, 20);
        System.out.println(myList.isEmpty());
        myList.insertAtHead(5);
        myList.traverse();
        System.out.println(myList.getHead());
        System.out.println(myList.getTail());
        myList.clear();
        // System.out.println(myList.isEmpty());
        // System.out.println(myList.search(30));
        // System.out.println("position of 20 : " + myList.findPos(20));
        // myList.updateAtPos(3, 500);
        myList.insertAtHead(10);
        myList.insertAtHead(20);
        myList.insertAtHead(10);
        myList.insertAtTail(40);
        myList.updateByValue(10, 60);
        
        // myList.traverse();
        // myList.deleteHead();
        // myList.traverse();

        // myList.traverse();
        // myList.deleteTail();
        // myList.traverse();

        myList.traverse();
        myList.deletePos(2);
        myList.traverse();
    }
}

 