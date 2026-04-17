# Binary Search Pattern

## When to Use
Use binary search when the data is sorted or when the problem allows you to reduce the search space into two halves based on some condition.

## Key Idea
Instead of checking every element one by one, always look at the middle element and decide which side to continue searching.

## How It Works
- Start with a range (start to end)
- Find the middle element
- Compare it with the target (or use given feedback)
- If the answer lies on one side, ignore the other half
- Keep repeating until you find the answer

## Example
- 374 - Guess Number Higher or Lower

## Complexity
- Time: O(log n) — search space gets halved each time
- Space: O(1)