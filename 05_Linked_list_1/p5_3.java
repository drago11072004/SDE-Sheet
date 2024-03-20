public class p5_3 {

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        if(first==null){return second;}
        if(second==null){return first;}
        if(first.data>second.data){LinkedListNode<Integer> x=first;
        first=second;second=x;}
        LinkedListNode<Integer> head=first;
        while(first!=null && second!=null){
            LinkedListNode<Integer> temp=null;
            while(first!=null && first.data<=second.data ){
                temp=first;
                first=first.next;
            }
            temp.next=second;
            LinkedListNode<Integer> x=second;
            second=first;
            first=x;
        }
        return head;
}
}
