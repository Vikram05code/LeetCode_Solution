package medium;
/*
Problem: 229 - Majority Element II
Link: https://leetcode.com/problems/majority-element-ii/

Approach: Extended Boyer-Moore Voting Algorithm

Idea:
- At most two elements can appear more than n/3 times
- Use two candidates and two counts
- Different elements cancel each other
- Verify candidates in second pass

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.List;

public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums){
        int count1=0, count2=0;
        int candidate1=0, candidate2=0;
        for(int num : nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }else if(count2 == 0){
                candidate2 = num;
                count2  = 1;
            }else{
                count1--;
                count2--;
            }
        }

        //verify candidates
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == candidate1){
                count1++;
            } else if (num == candidate2) {
               count2++;
            }
        }
        List<Integer> result = new java.util.ArrayList<>();
        if(count1 > nums.length/3) {
            result.add(candidate1);
        }if (count2 > nums.length/3) {
            result.add(candidate2);

        }

      return  result;
    }

    public static void main(String[] args) {
        MajorityElementII229 obj = new MajorityElementII229();
        int[] nums = {1,2,3,1,2,1,2};
        System.out.println(obj.majorityElement(nums));
    }

}
