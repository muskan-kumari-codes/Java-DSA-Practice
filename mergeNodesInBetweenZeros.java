package LinkedList;

public class sumNodesInBetweenZeros {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //basic solution
    public Node merge(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp = head.next;
        int sum = 0;
        Node dummy = new Node(-1);
        Node currT = dummy;
        Node currH = dummy;
        while(temp!=null){
            if(temp.data != 0){
                sum+=temp.data;
            }
            else{
                Node ans = new Node(sum);
                currT.next = ans;
                currT = currT.next;
                sum = 0;
            }
            temp = temp.next;
        }
        currH = currH.next;
        dummy.next = null;
        return currH;
    }


    //optimised code
    public Node mergeNode(Node head){
        if(head==null){
            return null;
        }
        Node read = head.next;
        Node write = head;
        int sum = 0;
        while(read!=null){
            if(read.data!=0){
                sum+=read.data;
            }else{
                write.data = sum;
                write.next = read.next;
                write = write.next;
                sum=0;
            }
            read = read.next;
        }
        return head;
    }
}
