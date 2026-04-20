package medium;

/*
Problem: 7 - Reverse Integer
Link: https://leetcode.com/problems/reverse-integer/

Approach:
- Extract digits using modulo (% 10)
- Build reversed number step by step
- Before updating, check for overflow

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class ReverseInteger7 {

    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {

            int lastDigit = x % 10;
            x /= 10;

            // Overflow check (positive side)
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            // Overflow check (negative side)
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + lastDigit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger7 obj = new ReverseInteger7();
        System.out.println(obj.reverse(123));    // 321
        System.out.println(obj.reverse(-123));   // -321
        System.out.println(obj.reverse(120));    // 21
        System.out.println(obj.reverse(1534236469)); // 0 (overflow)
    }
}
