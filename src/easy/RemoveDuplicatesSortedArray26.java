package easy;
/*
Problem: 26 - Remove Duplicates from Sorted Array
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Approach: Two Pointers (In-place)

Idea:
- Since array is sorted, duplicates are adjacent
- Keep track of unique elements using pointer k
- Compare current element with previous element

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {

    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        RemoveDuplicatesSortedArray26 removeDuplicatesSortedArray26 = new RemoveDuplicatesSortedArray26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicatesSortedArray26.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
