package java.test;

/**
 * describe
 * <p>
 * 2022/7/29 17:42
 *
 * @author MoQuan
 */
public class TestMain {

    public static void main(String[] args) {
        A a = new A();
        a.a=2;
        swap(a);
        System.out.println(a.a);
        a.a=2;
        swap2(a);
        System.out.println(a.a);
        System.out.println(a);
    }

    public static void swap(A a){
        a.a = 3;
    }

    public static void swap2(A a){
        System.out.println(a);
        a = new A();
        System.out.println(a);
    }

}
