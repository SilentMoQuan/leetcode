package java.linklist;

import java.util.HashSet;

/**
 * describe
 * <p>
 * 2022/8/6 12:48
 *
 * @author MoQuan
 */
public class no142 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        detectCycle(node1);
    }

    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();

        while (head != null){

            if (nodes.contains(head)){
                return head;
            }else{
                nodes.add(head);
                head = head.next;
            }

        }

        return null;
    }

}
