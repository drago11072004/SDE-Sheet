public class p6_5 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
            }
        }   
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){return null;}
        ListNode slow=head, fast=head;
        do{
            slow=slow.next;fast=fast.next.next;
            if(fast==null || fast.next==null || fast.next.next==null){return null;}
        }while(slow!=fast);
        fast=head;
        while(slow!=fast){
            slow=slow.next;fast=fast.next;
        }
        return slow;
    }
}
