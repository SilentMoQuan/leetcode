package java.array;

/**
 * describe
 * <p>
 * 2022/8/2 9:50
 *
 * @author MoQuan
 */
public class no622 {

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        System.out.println(queue.enQueue(1));
        System.out.println(queue.Rear());
        System.out.println(queue.Rear());
        System.out.println(queue.enQueue(2));
        System.out.println(queue.enQueue(3));
        System.out.println(queue.enQueue(4));
        System.out.println(queue.isFull());
        System.out.println(queue.deQueue());
        System.out.println(queue.enQueue(4));
        System.out.println(queue.Rear());

    }

}

class MyCircularQueue {

    int head = -1;
    int tail = -1;
    int size = 0;

    int[] values;
    int len;

    public MyCircularQueue(int k) {
        values = new int[k];
        len = k;
    }

    public boolean enQueue(int value) {

        if (head == -1) {
            head = tail = 0;
            values[head] = value;
            size++;
            return true;
        }

        if (!isFull()) {
            values[(tail = (tail + 1) % len)] = value;
            size++;
            return true;
        }

        return false;
    }

    public boolean deQueue() {

        // 队列为空
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % len;
        size--;

        return true;
    }

    public int Front() {

        if (isEmpty()) {
            return -1;
        }

        return values[head];
    }

    public int Rear() {

        if (isEmpty()) {
            return -1;
        }

        return values[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == len;
    }
}