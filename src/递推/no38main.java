package java.递推;

public class no38main {

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }


    static public String countAndSay(int n) {

        if (n == 0)
            return "";

        String ans = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder nextStr = new StringBuilder("");
            for (int j = 0; j < ans.length(); j++) {
                char temp = ans.charAt(j);
                int count = 0;
                while (j < ans.length() && temp == ans.charAt(j)) {
                    j++;
                    count++;
                }
                nextStr.append(count);
                nextStr.append(temp);
                j--;
            }
            ans = nextStr.toString();
        }

        return ans;
    }
}
