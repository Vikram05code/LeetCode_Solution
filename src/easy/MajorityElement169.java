package easy;

/*
Problem: 169 - Majority Element

Approach: Boyer-Moore Voting Algorithm

Idea:
- Keep a candidate and a count.
- If count becomes 0, choose current element as new candidate.
- If current element == candidate → increment count.
- Else → decrement count.
- Majority element will survive because it appears more than n/2 times.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MajorityElement169 {

    public int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for( int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num) {
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement169 obj = new MajorityElement169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
