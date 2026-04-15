package easy;

/*
Problem: 1 - Two Sum
Link: https://leetcode.com/problems/two-sum/

Approach:

Instead of checking all pairs, I use a HashMap to store numbers and their indices.
For each element, I calculate the complement (target - current number)
and check if it already exists in the map.

If yes, I return the indices.
Otherwise, I store the current number in the map.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum1 twoSum1 = new TwoSum1();
        int[] result = twoSum1.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
