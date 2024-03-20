public class p5_5 { public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}
 
 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cur=0;
        ListNode ptr1=l1, ptr2=l2;int x=0;
        ListNode l3=null;
        ListNode ptr=l3;
        while(ptr1!=null && ptr2!=null){
            x=ptr1.val+ptr2.val+cur;
            ListNode new_node=new ListNode(x%10);
            if(ptr==null){ptr=new_node;l3=ptr;}
            else{ptr.next=new_node;ptr=ptr.next;}
            cur=x/10;
            ptr1=ptr1.next;ptr2=ptr2.next;
            }
        while(ptr1!=null){
            x=ptr1.val+cur;
            ListNode new_node=new ListNode(x%10);
            if(ptr==null){ptr=new_node;}
            else{ptr.next=new_node;ptr=ptr.next;}
            cur=x/10;
            ptr1=ptr1.next;
            }
        while(ptr2!=null){
            x=ptr2.val+cur;
            ListNode new_node=new ListNode(x%10);
            if(ptr==null){ptr=new_node;}
            else{ptr.next=new_node;ptr=ptr.next;}
            cur=x/10;
            ptr2=ptr2.next;
            }
        if(cur!=0){ListNode new_node=new ListNode(1);ptr.next=new_node;ptr=ptr.next;}
        return l3;
    }
}
