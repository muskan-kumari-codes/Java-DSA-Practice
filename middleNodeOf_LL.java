//middle node of linked list
    public int middle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
