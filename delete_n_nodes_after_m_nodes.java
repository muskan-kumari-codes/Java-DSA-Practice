package LinkedList;

public class delete_k_nodes_after_n_nodes {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node delete(Node head, int m, int n){
        if(head==null || m==0){
            return null;
        }
        if(n==0){
            return head;
        }

        Node temp = head;
        while(temp!=null){
            for(int i=1; i<m && temp!=null; i++){
                temp = temp.next;
            }

            if(temp==null){
                break;
            }

            Node curr = temp.next;
            for(int i=0; i<n && curr!=null; i++){
                curr = curr.next;
            }            
            temp.next = curr;
            temp = curr;
        }
        return head;
    }
}
