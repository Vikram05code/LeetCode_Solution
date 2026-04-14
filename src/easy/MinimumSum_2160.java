

package easy;

/*
Problem: 2160 - Minimum Sum of Four Digit Number After Splitting Digits
Link: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

Approach:

First, I extract all the digits from the number and sort them.
To get the minimum possible sum, the idea is to use smaller digits in higher place values.
So instead of forming one large number, I distribute the digits between two numbers in a balanced way.

This way, both numbers stay as small as possible and their sum is minimized.

Why this works:
Placing smaller digits in the tens place reduces their impact on the overall value.
Also, balancing the digits between two numbers avoids creating a very large number.

Time Complexity: O(1)  // Only 4 digits, so operations are constant
Space Complexity: O(1)
*/

import java.util.Arrays;

public class MinimumSum_2160 {

    public static int minimumSum(int num){
        int[] digits = new int[4];
        for(int i=3; i<4; i--){
            digits[i]=num%10;
            num = num/10;
        }
        Arrays.sort(digits);
        int num1= digits[0]*10 + digits[2];
        int num2 = digits[1]*10 + digits[3];

      return num1+num2;
    }

    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }

}
