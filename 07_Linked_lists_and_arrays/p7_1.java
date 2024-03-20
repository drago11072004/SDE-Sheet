public class p7_1 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode tail = null, ptr = head;
        while (ptr != null) {
            if (ptr.next == null) {
                tail = ptr;
            }
            len++;
            ptr = ptr.next;
        }
        k = k % len;
        ptr = head;
        for (int i = 0; i < len - k - 1; i++) {
            ptr = ptr.next;
        }
        tail.next = head;
        head = ptr.next;
        ptr.next = null;
        return head;
    }
}
