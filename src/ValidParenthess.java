import java.util.ArrayList;

public class ValidParenthess {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if  (c== '(' || c == '{' || c== '['){
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.get(stack.size() - 1) != '(') {
                    return false;
                }
                stack.remove(stack.size() - 1);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.get(stack.size() - 1) != '{') {
                    return false;
                }
                stack.remove(stack.size() - 1);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.get(stack.size() - 1) != '[') {
                    return false;
                }
                stack.remove(stack.size() - 1);
            }}

        if (stack.size() != 0)
            return false;

        return true;
    
    
    }
}

