package java.linklist;

/**
 * describe
 * <p>
 * 2022/8/3 9:50
 *
 * @author MoQuan
 */
public class no707 {

    public static void main(String[] args) {

        MyLinkedList link = new MyLinkedList();

        link.addAtHead(84);
        link.addAtTail(2);
        link.addAtTail(39);
        link.get(3);
        link.get(1);
        link.addAtTail(42);
        link.addAtIndex(1, 80);
        link.addAtHead(14);
        link.addAtHead(1);
        link.addAtTail(53);
        link.addAtTail(98);
        link.addAtTail(19);
        link.addAtTail(12);
        link.get(2);
        link.addAtHead(16);
        link.addAtHead(33);
        link.addAtIndex(4, 17);
        link.addAtIndex(6, 8);
        link.addAtHead(37);
        link.addAtTail(43);
        link.deleteAtIndex(11);
        link.addAtHead(80);
        link.addAtHead(31);
        link.addAtIndex(13, 23);
        link.addAtTail(17);
        link.get(4);
        link.addAtIndex(10, 0);
        link.addAtTail(21);
        link.addAtHead(73);
        link.addAtHead(22);
        link.addAtIndex(24, 37);
        link.addAtTail(14);
        link.addAtHead(97);
        link.addAtHead(8);
        link.get(6);
        link.deleteAtIndex(17);
        link.addAtTail(50);
        link.addAtTail(28);
        link.addAtHead(76);
        link.addAtTail(79);
        link.get(18);
        link.deleteAtIndex(30);
        link.addAtTail(5);
        link.addAtHead(9);
        link.addAtTail(83);
        link.deleteAtIndex(3);
        link.addAtTail(40);
        link.deleteAtIndex(26);
        link.addAtIndex(20, 90);
        link.deleteAtIndex(30);
        link.addAtTail(40);
        link.addAtHead(56);
        link.addAtIndex(15, 23);
        link.addAtHead(51);
        link.addAtHead(21);
        link.get(26);
        link.addAtHead(83);
        link.get(30);
        link.addAtHead(12);
        link.deleteAtIndex(8);
        link.get(4);
        link.addAtHead(20);
        link.addAtTail(45);
        link.get(10);
        link.addAtHead(56);
        link.get(18);
        link.addAtTail(33);
        link.get(2);
        link.addAtTail(70);
        link.addAtHead(57);
        link.addAtIndex(31, 24);
        link.addAtIndex(16, 92);
        link.addAtHead(40);
        link.addAtHead(23);
        link.deleteAtIndex(26);
        link.get(1);
        link.addAtHead(92);
        link.addAtIndex(3, 78);
        link.addAtTail(42);
        link.get(18);
        link.addAtIndex(39, 9);
        link.get(13);
        link.addAtIndex(33, 17);
        link.get(51);
        link.addAtIndex(18, 95);
        link.addAtIndex(18, 33);
        link.addAtHead(80);
        link.addAtHead(21);
        link.addAtTail(7);
        link.addAtIndex(17, 46);
        link.get(33);
        link.addAtHead(60);
        link.addAtTail(26);
        link.addAtTail(4);
        link.addAtHead(9);
        link.get(45);
        link.addAtTail(38);
        link.addAtHead(95);
        link.addAtTail(78);
        link.get(54);
        link.addAtIndex(42, 86);

    }

}


class Node {

    Node() {
    }

    Node(int val) {
        this.value = val;
    }

    public int value;
    public Node next;

}

class MyLinkedList {

    int size = 0;
    Node head;
    Node tail;

    public MyLinkedList() {
        head = new Node();
        tail = head;
    }

    public int get(int index) {

        Node p = head.next;

        if (size <= index) {
            return -1;
        }

        while (index > 0) {
            p = p.next;
            index--;
        }

        return p.value;
    }

    public void addAtHead(int val) {
        head.value = val;
        Node node = new Node();
        node.next = head;
        head = node;
        size++;
        checkSize();
    }

    public void addAtTail(int val) {

        tail.next = new Node(val);
        tail = tail.next;
        size++;
        checkSize();

    }

    public void addAtIndex(int index, int val) {

        if (size < index) {
            return;
        }

        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node p = head;

            while (index > 0) {
                p = p.next;
                index--;
            }

            Node node = new Node(val);
            node.next = p.next;
            p.next = node;

            size++;
            checkSize();

        }

    }

    public void deleteAtIndex(int index) {
        if (index < size && index >= 0) {
            int i = index;
            Node p = head;

            while (index > 0) {
                p = p.next;
                index--;
            }

            p.next = p.next.next;

            if (i == size - 1){
                tail = p;
            }

            size--;
            checkSize();
        }
    }

    public void checkSize(){

        Node p = head;

        int check = 0;

        while (p.next != null){
            p = p.next;
            check++;
        }

        if(check != size){
            throw new RuntimeException("error");
        }

    }
}

//class MyLinkedListOld {
//
//    public static int size = 0;
//    public static MyLinkedList head = null;
//    public static MyLinkedList tail = null;
//
//    public int value;
//    public MyLinkedList next = null;
//
//    public MyLinkedList() {
//
//    }
//
//    public int get(int index) {
//
//        MyLinkedList p = head;
//
//        if (index > size) {
//            return -1;
//        }
//
//        while (index > 0) {
//
//            p = p.next;
//
//            index--;
//        }
//
//        return p.value;
//    }
//
//    public void addAtHead(int val) {
//        if (head == null) {
//            head = new MyLinkedList();
//            head.value = val;
//            tail = head;
//        } else {
//            MyLinkedList node = new MyLinkedList();
//            node.next = head;
//            head = node;
//            head.value = val;
//        }
//        size++;
//
//    }
//
//    public void addAtTail(int val) {
//        if (head == null) {
//            head = new MyLinkedList();
//            head.value = val;
//            tail = head;
//        } else {
//            tail.next = new MyLinkedList();
//            tail = tail.next;
//            tail.value = val;
//        }
//        size++;
//    }
//
//    public void addAtIndex(int index, int val) {
//
//        if (index <= 0) {
//            addAtHead(val);
//        } else if (index == size) {
//            addAtTail(val);
//        } else if (index < size) {
//            MyLinkedList p = head;
//            while (index - 1 > 0) {
//
//                p = p.next;
//
//                index--;
//            }
//
//            MyLinkedList node = new MyLinkedList();
//            node.value = val;
//            node.next = p.next;
//            p.next = node;
//        }
//
//        size++;
//    }
//
//    public void deleteAtIndex(int index) {
//        if (index >= 0 && index < size) {
//            MyLinkedList p = head;
//
//            // 头结点
//            if (index == 0) {
//                head = head.next;
//            } else if (size - 1 == index) {
//                while (p.next.next != null) {
//                    p = p.next;
//                }
//                p.next = null;
//            }else {
//                while (index - 1 > 0) {
//
//                    p = p.next;
//
//                    index--;
//                }
//                p.next = p.next.next;
//            }
//            size--;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "MyLinkedList{" +
//                "value=" + value +
//                '}';
//    }
//}