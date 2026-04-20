package medium;
/*
Problem: 189 - Rotate Array
https://leetcode.com/problems/rotate-array/description/
Approach:
- Use reversal technique
- Reverse whole array
- Reverse first k elements
- Reverse remaining elements

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.Arrays;

public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray189 obj = new RotateArray189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        obj.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
