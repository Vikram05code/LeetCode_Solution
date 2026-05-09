package medium;
/*
Problem: 53 - Maximum Subarray
Link: https://leetcode.com/problems/maximum-subarray/

Approach: Kadane's Algorithm

Idea:
- Maintain current running sum
- At each index:
    - Either start a new subarray
    - Or continue previous subarray
- Track maximum sum seen so far

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaximumSubArray53 {
    public int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum+nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubArray53 obj = new MaximumSubArray53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
