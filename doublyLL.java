package LinkedList;

public class doublyLL {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    doublyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    //insertion
    //insert at head
    public void insertHead(int n){
        Node newNode = new Node(n);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    //insert at tail
    public void insertTail(int n){
        Node newNode = new Node(n);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
        size++;
    }

    //insert at position
    public void insertPos(int pos, int data){
        Node newNode = new Node(data);
        if(pos<1 || pos>size){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            insertHead(data);
            return;
        }
        if(pos==size){
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

    //traverse and printing the list
    public void printList(){
        if(head==null && tail==null){
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //backward traversal
    public void backward(){
        Node temp = tail;
        while(temp!=null){
            System.out.print("<-" + temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }


    //searching
    public boolean search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //update old value to new value
    public void update(int oldValue, int newValue){
        Node temp = head;
        while(temp!=null){
            if(temp.data==oldValue){
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    //deletion
    //delete head
    public void deleteHead(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = head.next;
        temp.prev = null;
        head = temp;
        size--;
    }

    //delete tail
    public void deleteTail(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node temp = tail.prev;
        temp.next = null;
        tail = temp;       
        size--;
    }

    // delete at any position
    public void deletePos(int pos){
        if(pos<1 || pos>size){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            deleteHead();
            return;
        }
        if(pos==size){
            deleteTail();
            return;
        }
        Node temp = head;
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        Node forward = temp.next.next;
        Node curr = temp.next;
        temp.next = forward;
        forward.prev = temp;
        curr.next = null;
        size--;
    }

    public static void main(String[] args) {
        doublyLL myList = new doublyLL();
        myList.insertHead(5);
        myList.insertTail(20);
        myList.insertPos(2, 60);
        myList.insertPos(2, 55);
        myList.insertTail(19);
        myList.insertPos(3, 88);
        myList.printList();
        
        // myList.backward();
        // System.out.println("searching 88 : " + myList.search(88));
        myList.update(55, 15);
        myList.printList();

        // myList.deleteHead();
        // myList.printList();

        // myList.deleteTail();
        // myList.printList();

        myList.deletePos(3);
        myList.printList();

    }
}
