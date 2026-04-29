package easy;

/*
Problem: 27 - Remove Element
Link: https://leetcode.com/problems/remove-element/

Approach: Two Pointers (In-place)

Idea:
- Use pointer k to track position of valid elements
- Traverse array:
  - If element != value → place it at index k
  - Increment k

Result:
- First k elements are valid
- Remaining elements are ignored

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class RemoveElements27 {

    public int removeElement(int[] nums, int value){
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != value){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args){
        RemoveElements27 removeElements27 = new RemoveElements27();
        int[] nums = {3,2,2,3};
        int value = 3;
        int k = removeElements27.removeElement(nums, value);
        System.out.println("Number of elements not equal to value: " + k);
        System.out.println("Array after removing elements: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
