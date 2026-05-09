##  Problem
50 - Pow(x, n)

##  Key Insight
Reduce exponent by half using divide and conquer.

##  Strategy
- Recursively compute x^(n/2)
- Square result
- Multiply by x if n is odd

##  Important
Handle negative exponent using reciprocal

---------------------------------------------------------------------------------------
##  Missing Number
268 - Missing Number
###  Idea
Expected sum - actual sum = missing number

### Formula
n * (n + 1) / 2

### Complexity
- Time: O(n)
- Space: O(1)
