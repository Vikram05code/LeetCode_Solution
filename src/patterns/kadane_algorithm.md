# Kadane's Algorithm

##  Use When
- Maximum/minimum contiguous subarray problems
- Need O(n) optimization

---

##  Core Idea
At every index:
- Continue current subarray
  OR
- Start fresh

Choose whichever is better.

---

##  Formula

```java
currentSum = Math.max(nums[i],
                      currentSum + nums[i]);