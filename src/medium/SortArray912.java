package medium;
/*
Problem: 912 - Sort an Array
https://leetcode.com/problems/sort-an-array/description/
Approach: Merge Sort (Divide and Conquer)
- Divide array into halves
- Sort recursively
- Merge sorted halves

Time Complexity: O(n log n)
Space Complexity: O(n)
*/
import java.util.Arrays;

public class SortArray912 {

    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        divide(nums, start, end);

        return nums;
    }

    private void divide(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(nums, start, mid); //left side
        divide(nums, mid + 1, end); //right side
        merge(nums, start, mid, end);

    }

    private void merge(int[] nums, int start, int mid, int end) {
        int i = start; //left side starting point
        int j = mid + 1; //right side starting point
        int k = 0;
        int[] temp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            nums[start + x] = temp[x];
        }


    }

    public static void main(String[] args) {
        SortArray912 sortArray = new SortArray912();
        int[] nums = {3, 5, 1, 2, 4, 7, 6};
        System.out.println("Before Sorting : " + Arrays.toString(nums));
        System.out.println("After Sorting : " + Arrays.toString(sortArray.sortArray(nums)));
        sortArray.sortArray(nums);

    }


}
