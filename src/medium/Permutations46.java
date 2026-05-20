package medium;

/*
Problem: 46 - Permutations
https://leetcode.com/problems/permutations/description/
Approach: Backtracking

Idea:
- Choose an unused element
- Add it to current permutation
- Recurse
- Backtrack by removing element

Time Complexity: O(n * n!)
Space Complexity: O(n)
*/

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>());
        return result;
    }

    public void backtrack(List<List<Integer>> result , int[] nums, List<Integer> current){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
        }
        for(int num : nums){
            if(current.contains(num)){
                continue;
            }
            current.add(num);
            backtrack(result, nums, current);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args){
        Permutations46 obj = new Permutations46();
        int[] nums = {1,2,3};
        List<List<Integer>> result = obj.permute(nums);
        System.out.println("Permutations: " + result);
    }
}
