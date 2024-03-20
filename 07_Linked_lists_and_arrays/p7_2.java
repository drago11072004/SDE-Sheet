public class p7_2 {

    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head==null){return null;}
        Node ptr=head;
        while(ptr!=null){
            Node new_node = new Node(ptr.val);
            new_node.next=ptr.next;
            ptr.next=new_node;
            ptr=ptr.next.next;
        }
        ptr=head;
        while(ptr!=null){
            if(ptr.random!=null){ptr.next.random=ptr.random.next;}
            ptr=ptr.next.next;
        }
        Node temp=new Node(0);
        Node dummy=temp;Node fast;
        ptr=head;
        while(ptr!=null){
            fast=ptr.next.next;
            dummy.next=ptr.next;
            ptr.next=fast;
            dummy=dummy.next;
            ptr=fast;
        }
        return temp.next;
    }
}
