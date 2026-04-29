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