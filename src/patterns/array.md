##  Problem
189 - Rotate Array

##  Key Insight
Use reversal to rotate array in-place instead of shifting elements.

##  Strategy
- Reverse entire array
- Reverse first k elements
- Reverse remaining elements

##  Important
k = k % n
----------------------------------------------------------------------------------------------------------------------------------------------

# Array Marking Pattern
448 - Find All Numbers Disappeared in an Array
##  Use When
- Values are limited to [1,n]
- Need O(1) extra space

---

##  Core Idea
Use array indices as storage/markers.

value x → index (x - 1)

Mark visited indices using:
- negative sign
- swapping
- cyclic placement

---

##  Common Tricks

### Negative Marking
```java
int index = Math.abs(nums[i]) - 1;
nums[index] = -nums[index];