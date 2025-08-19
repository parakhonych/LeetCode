/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false
 */


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

