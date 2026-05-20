package medium;
/*
Problem: 78 - Subsets
https://leetcode.com/problems/subsets/description/

Approach: Backtracking

Idea:
- Every state is a valid subset
- Choose current element
- Explore recursively
- Backtrack by removing element

Time Complexity: O(n * 2^n)
Space Complexity: O(n)
*/
import java.util.ArrayList;
import java.util.List;

public class SubSets78 {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>(), 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, int[] nums, List<Integer> current, int start){
        result.add(new ArrayList<>(current));
        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(result, nums, current, i+1);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args){
        SubSets78 obj = new SubSets78();
        int[] nums = {1,2,3};
        List<List<Integer>> result = obj.subsets(nums);
        System.out.println("Subsets: " + result);
    }

}
