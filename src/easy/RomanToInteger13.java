package easy;
/*
Problem: 13 - Roman to Integer
Link: https://leetcode.com/problems/roman-to-integer/

Approach: Greedy (Array Lookup Optimization)

Idea:
- If current value < next value → subtract
- Else → add

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RomanToInteger13 {
    public int romanToInt(String s){
        /*Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);*/
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int result = 0;
        for(int i=0; i<s.length(); i++){
            int current = values[s.charAt(i)];
            if((i+1<s.length()) && current < values[s.charAt(i+1)]){
                result -= current;
            }else{
                result+=current;
            }
        }

      return result;
    }

    public static void main(String[] args){
        String s = "MCMXCIV";
        RomanToInteger13 obj = new RomanToInteger13();
        int result = obj.romanToInt(s);
        System.out.println("Integer Value: " + result);
    }

}
