# Problem-Solving Index

Solutions are grouped by difficulty and include Python and Java implementations with example checks and complexity notes.

## Easy

| Problem | Python | Java | Concept |
| --- | --- | --- | --- |
| Two Sum | — | [Java](easy/TwoSum.java) | Hash map |
| Valid Anagram | — | [Java](easy/ValidAnagram.java) | Frequency counting |
| First Non-Repeating Character | — | [Java](easy/FirstNonRepeatingCharacter.java) | Hash map |
| Remove Duplicates | — | [Java](easy/RemoveDuplicates.java) | Set |
| Valid Parentheses | — | [Java](easy/ValidParentheses.java) | Stack |
| Binary Search | — | [Java](easy/BinarySearch.java) | Searching |

## Intermediate

| Problem | Python | Java | Concept |
| --- | --- | --- | --- |
| Maximum Subarray Sum | — | [Java](intermediate/MaximumSubarraySum.java) | Kadane's algorithm |
| Longest Unique Substring | — | [Java](intermediate/LongestUniqueSubstring.java) | Sliding window |
| Merge Intervals | — | [Java](intermediate/MergeIntervals.java) | Sorting and intervals |
| Special Substrings | — | [Java](intermediate/SpecialSubstrings.java) | String interval reasoning |
| Two Sum on Sorted Input | — | [Java](intermediate/TwoSumSorted.java) | Two pointers |
| Product Except Self | — | [Java](intermediate/ProductExceptSelf.java) | Prefix and suffix products |
| Valid Palindrome | — | [Java](intermediate/ValidPalindrome.java) | Two pointers |

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
