package easy;
/*
Problem: 448 - Find All Numbers Disappeared in an Array
Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Approach: Index Marking

Idea:
- Values are in range [1, n]
- Use value as index mapping:
    value x → index (x - 1)
- Mark visited indices negative
- Positive indices represent missing numbers

Time Complexity: O(n)
Space Complexity: O(1) (excluding output list)
*/

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers448 {
    public List<Integer> findDisappearedNumbers(int[] nums){
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] >0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers448 obj = new FindDisappearedNumbers448();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}
