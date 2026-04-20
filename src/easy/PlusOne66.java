package easy;

/*
Problem: 66 - Plus One

Approach:
- Traverse from right to left
- Handle carry like manual addition
- If digit < 9 → increment and return
- If digit == 9 → set to 0 and continue
- If all digits are 9 → create new array

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class PlusOne66 {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        PlusOne66 obj = new PlusOne66();
        int[] result = obj.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }

}
