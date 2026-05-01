## Problem
643 - Maximum Average Subarray I

## Key Insight
Reuse previous window sum instead of recalculating.

## Strategy
- Calculate first window sum
- Slide window:
    - Add next element
    - Remove previous element
- Track max sum

##  Important
Initialize max with first window (handle negatives)
-------------------------------------------------------------------------

##  Problem
3 - Longest Substring Without Repeating Characters

##  Key Insight
Track last seen index of characters to jump the window instead of shrinking step-by-step.

##  Strategy
- Use sliding window
- If duplicate found → move start to lastSeen + 1
- Update max length

##  Important
- Use array of size 128 for O(1) space
- Initialize with -1 to distinguish unseen characters