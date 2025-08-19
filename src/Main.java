
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        String s = "{{";
        ValidParenthess validParenthess = new ValidParenthess();
        boolean result = validParenthess.isValid(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);


    }
}