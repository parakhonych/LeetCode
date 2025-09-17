import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        CommonPrefix cP = new CommonPrefix();

        System.out.println(cP.longestCommonPrefix(strs));
    }
}
