package easy;

/*
Problem: 88 - Merge Sorted Array
Link: https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

Approach: Two Pointers (In-place, from end)

Idea:
- nums1 has extra space at the end to hold elements of nums2
- Instead of merging from the front (which would overwrite values),
  we merge from the back

Steps:
1. Use two pointers for comparison and one pointer for placement:
   - i → last valid element in nums1 (m - 1)
   - j → last element in nums2 (n - 1)
   - k → last position in nums1 (m + n - 1)

2. Compare nums1[i] and nums2[j]:
   - Place the larger one at nums1[k]

3. Move the respective pointer (i or j) and decrease k

4. Continue until all elements of nums2 are placed

Important:
- We only need to check j >= 0
- If nums1 elements are left, they are already in correct position

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,4,5};
        int m = 3;
        int n = 3;
        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        mergeSortedArray88.merge(nums1, m, nums2, n);
        System.out.println("Merged Sorted Array :"+ Arrays.toString(nums1));
    }

}
