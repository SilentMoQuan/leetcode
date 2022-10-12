package java.linklist;

/**
 * describe
 * <p>
 * 2022/8/6 11:58
 *
 * @author MoQuan
 */
public class no19 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;

        removeNthFromEnd(node1, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode virtual = new ListNode();
        ListNode p = virtual;
        ListNode q = null;
        virtual.next = head;

        while (p != null) {
            if (n == 0) {
                q = virtual;
            } else if (q != null) {
                q = q.next;
            }
            p = p.next;
            n--;
        }

        q.next = q.next.next;

        return virtual.next;
    }

}



