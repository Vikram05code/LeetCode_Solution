## Problem
167 - Two Sum II (Sorted Array)

## Key Insight
Since the array is sorted, we can use two pointers from both ends instead of brute force.

## Strategy
- Start one pointer at beginning and one at end
- If sum is too large → move right pointer
- If sum is too small → move left pointer
- If equal → return result

##  Important
- Use start < end (cannot use same element twice)
- Return 1-based indices
- -----------------------------------------------------------------------------------------------------------------------

##  Problem
26 - Remove Duplicates from Sorted Array

##  Key Insight
Sorted array → duplicates are adjacent

##  Strategy
- Compare current with previous
- Keep only unique elements

##  Important
Use two pointers (read + write)