##  Pattern: Boyer-Moore Voting

###  Use When
- Need element(s) appearing more than k fraction (e.g., n/2, n/3)
- Constraints demand O(n) time and O(1) space
- Counting with HashMap is not allowed/optimal

---

###  Idea
- Keep a candidate and a count
- Same element → count++
- Different element → count--
- If count becomes 0 → change candidate

---

###  Intuition
Different elements cancel each other.
The majority element cannot be fully cancelled.

-------------------------------------------------------------------------------------------------