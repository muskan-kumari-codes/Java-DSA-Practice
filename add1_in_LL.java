package LinkedList;

public class add1_In_LL {
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
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public Node add1(Node head){
        if(head==null){
            return new Node(1);
        }
        head = reverse(head);
        int carry = 1;
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            
            int sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            prev = curr;

            if(carry==0){
                break;
            }
            curr = curr.next;

        }
        if(carry!=0){
            Node ans = new Node(carry);
            prev.next = ans;
        }
        head = reverse(head);
        return head;
    }
}
