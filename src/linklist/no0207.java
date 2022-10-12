package java.linklist;

import java.util.HashSet;

/**
 * describe
 * <p>
 * 2022/8/6 12:24
 *
 * @author MoQuan
 */
public class no0207 {

    HashSet<ListNode> nodes = new HashSet<>();
    ListNode ans = null;
    int count = 0;

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null || headB != null) {

            if (headA != null) {
                if (!addNode(headA)) {
                    break;
                }
                headA = headA.next;
            }

            if (headB != null) {
                if (!addNode(headB)) {
                    break;
                }
                headB = headB.next;
            }

        }

        return ans;
    }

    public boolean addNode(ListNode node) {

        nodes.add(node);
        count++;
        if (nodes.size() != count) {
            ans = node;
            return false;
        }

        return true;
    }

}
