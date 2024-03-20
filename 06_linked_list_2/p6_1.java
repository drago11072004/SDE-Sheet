public class p6_1 {
    class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }
public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node ptr1=firstHead,ptr2=secondHead;int l1=1,l2=1;
        while(ptr1!=null || ptr2!=null){
            if(ptr1!=null){l1++;ptr1=ptr1.next;}
            if(ptr2!=null){l2++;ptr2=ptr2.next;}
        }
        ptr1=firstHead;ptr2=secondHead;
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){ptr1=ptr1.next;}
        }
        if(l2>l1){
            for(int i=0;i<l2-l1;i++){ptr2=ptr2.next;}
        }
        while(ptr1!=null){
            if(ptr1==ptr2){return ptr1.data;}
            ptr1=ptr1.next;ptr2=ptr2.next;
        }
        return 0;
    }
}
