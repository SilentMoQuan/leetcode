package java.linklist;

/**
 * describe
 * <p>
 * 2022/8/2 12:26
 *
 * @author MoQuan
 */
public class no203 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode result = removeElements(head, 2);

        while (result.next != null){
            System.out.println(result);
            result = result.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val){
            head = head.next;
        }

        if(head == null){
            return head;
        }

        ListNode p = head;

        while (p != null && p.next != null){
            if (p.next.val == val){
                ListNode q = p.next;
                while (q != null && q.val == val){
                    q = q.next;
                }
                p.next = q;
            }
            p = p.next;
        }

        return head;
    }
}