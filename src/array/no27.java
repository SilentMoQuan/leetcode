package java.array;

/**
 * describe
 * <p>
 * 2022/6/21 10:46
 *
 * @author MoQuan
 */
public class no27 {

    public static void main(String[] args) {
        System.out.println(removeElement(
                new int[]{0,1,2,2,3,0,4,2},
                2));
    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;

        for (int front = 0; front < nums.length; front++){

            if(nums[front] == val){

                do {

                    if(nums[front] == val){
                        front++;
                    }

                }while (front < nums.length && nums[front] == val);



            }

            if (front < nums.length) {
                nums[index] = nums[front];
                index++;
            }

        }

        return index;
    }

}
