package medium;
/*
Problem: 238 - Product of Array Except Self
Link: https://leetcode.com/problems/product-of-array-except-self/

Approach: Prefix + Suffix (Space Optimized)

Idea:
- First pass: store left product in result array
- Second pass: multiply with right product using variable

Time Complexity: O(n)
Space Complexity: O(1) (excluding output)
*/

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i =1; i<n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i =n-1; i>=0; i--){
            ans[i] = ans[i]*right;
            right = right*nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf238 obj = new ProductOfArrayExceptSelf238();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));

    }
}
