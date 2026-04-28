package medium;

/*
Problem: 167 - Two Sum II (Input Array Is Sorted)
Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

Approach: Two Pointers

Idea:
- Since array is sorted, we can avoid brute force
- Use two pointers:
  - One at beginning (start)
  - One at end (end)

Steps:
1. Calculate sum of numbers[start] + numbers[end]
2. If sum > target → decrease end (need smaller value)
3. If sum < target → increase start (need bigger value)
4. If equal → return indices (1-based)

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class TwoSumArraySorted167 {

    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end  = numbers.length-1;
        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum>target){
                end--;
            }
            else if(sum<target){
                start++;
            }
            else{
                return new int[]{start+1, end+1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumArraySorted167 twoSumArraySorted167 = new TwoSumArraySorted167();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumArraySorted167.twoSum(numbers, target);
        System.out.println("Result: " + Arrays.toString(result));
    }

}
