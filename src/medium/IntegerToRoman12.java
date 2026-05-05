package medium;
/*
Problem: 12 - Integer to Roman
Link: https://leetcode.com/problems/integer-to-roman/

Approach: Greedy

Idea:
- Always pick the largest possible Roman value
- Subtract it from num
- Append corresponding symbol

Time Complexity: O(1) (fixed number of symbols)
Space Complexity: O(1)
*/
public class IntegerToRoman12 {

    public String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<values.length; i++){
            while(num>=values[i]){
                sb.append(symbols[i]);
                num -= values[i];
            }

        }
        return sb.toString();
    }


    public static void main(String[] args){
        int num = 1994;
        IntegerToRoman12 obj = new IntegerToRoman12();
        String result = obj.intToRoman(num);
        System.out.println("Roman Numeral: " + result);
    }
}
