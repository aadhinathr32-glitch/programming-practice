# Testing

## Python

Use Python 3.10 or later. From the repository root:

\`\`\`bash
python -m pip install -r requirements-dev.txt
python -m pytest -v
\`\`\`

The pytest suite checks representative outputs and edge cases for the Python solutions.

## Java

Use JDK 17 or later. From the repository root:

\`\`\`bash
mkdir -p build/java
find problem-solving -name '*.java' -print0 | xargs -0 javac -d build/java
java -cp build/java TwoSum
java -cp build/java ValidAnagram
java -cp build/java FirstNonRepeatingCharacter
java -cp build/java RemoveDuplicates
java -cp build/java ValidParentheses
java -cp build/java BinarySearch
java -cp build/java MaximumSubarraySum
java -cp build/java LongestUniqueSubstring
java -cp build/java MergeIntervals
java -cp build/java SpecialSubstrings
\`\`\`

Each Java class includes a self-checking example runner. GitHub Actions runs the Python test suite and Java example runners on pushes and pull requests to the main branch.
