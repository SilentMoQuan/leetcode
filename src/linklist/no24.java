package java.linklist;

/**
 * describe
 * <p>
 * 2022/8/6 10:55
 *
 * @author MoQuan
 */
public class no24 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        swapPairs(node1);
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode virtual = head.next;

        ListNode p = head;
        ListNode n = head.next;
        ListNode temp = head.next.next;

        if(temp == null){
            n.next = p;
            p.next = null;
            return n;
        }

        while (true){

            n.next = p;
            if(temp.next == null){
                p.next = temp;
            }else {
                p.next = temp.next;
            }

            p = temp;
            n = p.next;
            if(n == null){
                break;
            }
            temp = p.next.next;
            if(temp == null){
                n.next = p;
                p.next = null;
                break;
            }

        }

        return virtual;
    }

}
