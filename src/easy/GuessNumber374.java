package easy;
/*
Problem: 374 - Guess Number Higher or Lower
https://leetcode.com/problems/guess-number-higher-or-lower/

Approach:
- Use Binary Search on range [1, n]
- Check mid using guess()
- Adjust search space based on result

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class GuessNumber374 {

    private int pick = 50;

    private int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }

    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int response = guess(mid);

            if (response == 0) return mid;
            else if (response == 1) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 100;
        GuessNumber374 obj = new GuessNumber374();
        int result = obj.guessNumber(n);
        System.out.println("The guessed number is: " + result);
    }
}