##  Problem
2160 - Minimum Sum of Four Digit Number

## Key Insight
The idea is to minimize the total sum by arranging digits smartly. Smaller digits should be placed in higher place values so their impact on the final number stays low.

##  Strategy
- Extract all digits and sort them
- Distribute them between two numbers in a balanced way
- Make sure smaller digits are used in the tens place

##  Learning
This is a classic greedy approach — making the best choice at each step (picking smaller digits first) leads to the overall minimum sum.