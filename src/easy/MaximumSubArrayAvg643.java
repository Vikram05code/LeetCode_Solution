package easy;
/*
Problem: 643 - Maximum Average Subarray I
Link: https://leetcode.com/problems/maximum-average-subarray-i/

Approach: Sliding Window (Fixed Size)

Idea:
- Calculate sum of first k elements
- Slide window by removing left element and adding next element
- Track maximum sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaximumSubArrayAvg643 {

    public double findMaxAverage(int[] nums, int k){

       int sum = 0;
       for(int i=0; i<k; i++){
           sum+=nums[i];
       }
      double maxAvg = sum;
       for(int j=k; j<nums.length; j++){
           sum+=nums[j]-nums[j-k];
          maxAvg = Math.max(maxAvg, sum);
       }


       return maxAvg/k;
    }

    public static void main(String[] args){
        MaximumSubArrayAvg643 maximumSubArrayAvg643 = new MaximumSubArrayAvg643();
        int[] nums = {1,12,-5, -6, 50, 3};
        int k = 4;
        double result = maximumSubArrayAvg643.findMaxAverage(nums, k);
        System.out.println("Maximum Average: " + result);
    }
}
