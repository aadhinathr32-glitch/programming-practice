# Problem-Solving Index

Solutions are grouped by difficulty and include Python and Java implementations with example checks and complexity notes.

## Easy

| Problem | Python | Java | Concept |
| --- | --- | --- | --- |
| Two Sum | [Python](easy/two-sum.py) | [Java](easy/TwoSum.java) | Hash map |
| Valid Anagram | [Python](easy/valid-anagram.py) | [Java](easy/ValidAnagram.java) | Frequency counting |
| First Non-Repeating Character | [Python](easy/first-non-repeating-character.py) | [Java](easy/FirstNonRepeatingCharacter.java) | Hash map |
| Remove Duplicates | [Python](easy/remove-duplicates.py) | [Java](easy/RemoveDuplicates.java) | Set |
| Valid Parentheses | [Python](easy/valid-parentheses.py) | [Java](easy/ValidParentheses.java) | Stack |
| Binary Search | [Python](easy/binary-search.py) | [Java](easy/BinarySearch.java) | Searching |

## Intermediate

| Problem | Python | Java | Concept |
| --- | --- | --- | --- |
| Maximum Subarray Sum | [Python](intermediate/maximum-subarray-sum.py) | [Java](intermediate/MaximumSubarraySum.java) | Kadane's algorithm |
| Longest Unique Substring | [Python](intermediate/longest-substring-without-repeating.py) | [Java](intermediate/LongestUniqueSubstring.java) | Sliding window |
| Merge Intervals | [Python](intermediate/merge-intervals.py) | [Java](intermediate/MergeIntervals.java) | Sorting and intervals |
| Special Substrings | [Python](intermediate/special-substrings.py) | [Java](intermediate/SpecialSubstrings.java) | String interval reasoning |
| Two Sum on Sorted Input | [Python](intermediate/two-sum-sorted.py) | [Java](intermediate/TwoSumSorted.java) | Two pointers |
| Product Except Self | [Python](intermediate/product-except-self.py) | [Java](intermediate/ProductExceptSelf.java) | Prefix and suffix products |
| Valid Palindrome | [Python](intermediate/valid-palindrome.py) | [Java](intermediate/ValidPalindrome.java) | Two pointers |

## Run examples

Python:

```bash
python problem-solving/intermediate/product-except-self.py
```

Java, from the repository root:

```bash
mkdir -p build/java
find problem-solving -name '*.java' -print0 | xargs -0 javac -d build/java
java -cp build/java ProductExceptSelf
```

Python tests are in `tests/python/`. The GitHub Actions workflow compiles Java examples and runs their self-checks on pushes and pull requests to the main branch.
