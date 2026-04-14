package easy;
/*
Problem: 258 - Add Digits
Link: https://leetcode.com/problems/add-digits/

Approach 1 (Baseline - Iterative):
- Keep summing digits until number becomes a single digit
- Time Complexity: O(log n)
- Space Complexity: O(1)

Approach 2 (Optimal - Digital Root):
- Use mathematical property of digital root
- Formula: 1 + (num - 1) % 9
- Time Complexity: O(1)
- Space Complexity: O(1)
*/

class Solution {

    /*
    // Baseline Approach (Iterative)
    private int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {
        while (num > 9) {
            num = sumDigits(num);
        }
        return num;
    }
    */

    //Optimal Approach
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }


}
