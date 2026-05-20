## Generate Valid Parentheses
22 - Generate Parentheses
Rules:
- open < n
- close < open

Technique:
- Choose
- Explore
- Backtrack

Used in:
- Generate Parentheses
- N Queens
- Sudoku
- Combination Sum

--------------------------------------------------------------------------------------------------------------
## Subset Generation
78 - Subsets
At every element:
- pick
  OR
- skip

Classic:
choose → recurse → backtrack

--------------------------------------------------------------------------------------------------------------
## Permutation Generation

At every step:
- choose unused element
- recurse
- backtrack

Difference from subsets:
- subsets use forward traversal
- permutations try every unused choice
