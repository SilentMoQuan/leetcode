package java.linklist;

import java.util.ArrayList;

/**
 * describe
 * <p>
 * 2022/8/6 10:42
 *
 * @author MoQuan
 */
public class no206 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        reverseList(node1);
    }

    public static ListNode reverseList(ListNode head) {

        ArrayList<ListNode> nodes = new ArrayList<>();

        while (head != null){
            nodes.add(head);
            head = head.next;
        }

        for (int i = nodes.size() - 1; i > 0; i--) {

            nodes.get(i).next = nodes.get(i - 1);

            if(i == 1){
                nodes.get(0).next = null;
            }

        }

        return nodes.get(nodes.size() - 1);
    }

}
