# Frequency Counting Pattern
387 - First Unique Character in a String
##  Use When
- Counting occurrences
- Duplicate detection
- Character frequency problems

---

##  Common Trick

```java
freq[ch - 'a']++;
--------------------------------------------------------------------------------------------------------------------------------

## Anagram Check
242 - Valid Anagram
### 💡 Idea
Increment for first string,
decrement for second string.

If all counts become zero:
strings are anagrams.

---

### Common Trick

```java
freq[s.charAt(i) - 'a']++;
freq[t.charAt(i) - 'a']--;

---------------------------------------------------------------------------------------------------------------------------------

## Palindrome Pairing Trick
409 - Longest Palindrome
- Palindrome mostly uses pairs
- Even counts fully usable
- Odd counts contribute:
    count - 1
- One odd character allowed in center