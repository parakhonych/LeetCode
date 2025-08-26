/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"



Constraints:

    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.

*/


public class AddBinary {
    public String addBinary(String a, String b) {
            int lenA = a.length();
            int lenB = b.length();
            if (lenA < lenB) {
                a = "0".repeat(lenB - lenA) + a;
            }
            else if (lenB < lenA) {
                b = "0".repeat(lenA - lenB) + b;
            }
            StringBuilder result = new StringBuilder();
            int carry = 0;
            for (int i = a.length() - 1; i >= 0; i--) {
                int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
                if (sum >= 2) {
                    carry = 1;
                    sum -= 2;
                } else {
                    carry = 0;
                }
                result.append(sum);
            }
            if (carry == 1) {
                result.append('1');
            }           
            return result.reverse().toString();
            
    }

}
