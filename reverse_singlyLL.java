//reverse linked list
    public void reverse(){
        Node curr = head;
        Node prev = null;
        
        while(curr!=null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;    
        }
        head = prev;
    }
