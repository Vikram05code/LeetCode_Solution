package easy;
/*
Problem: 268 - Missing Number
Link: https://leetcode.com/problems/missing-number/

Approach: Math Formula

Idea:
- Numbers are in range [0, n]
- Calculate expected sum using formula:
  n * (n + 1) / 2
- Subtract actual array sum
- Remaining value is the missing number

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MissingNumber268 {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
    }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber268 obj = new MissingNumber268();
        int[] nums = {9, 0, 1, 2, 3, 4, 5, 6, 7};
        int result = obj.missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}
