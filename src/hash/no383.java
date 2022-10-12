package java.hash;

/**
 * describe
 * <p>
 * 2022/8/8 10:28
 *
 * @author MoQuan
 */
public class no383 {

    public static void main(String[] args) {



    }

    public boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length() < ransomNote.length()){
            return false;
        }

        int[] countArr = new int[26];

        char[] sourceArr = magazine.toCharArray();
        char[] noteArr = ransomNote.toCharArray();

        for (int i = 0; i < sourceArr.length; i++) {

            countArr[sourceArr[i] - 'a'] += 1;
            if(i < noteArr.length){
                countArr[noteArr[i] - 'a'] -= 1;
            }
        }

        for (int sum : countArr) {
            if (sum < 0) {
                return false;
            }
        }

        return true;
    }

}
