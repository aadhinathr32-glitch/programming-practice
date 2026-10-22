# Time and Space Complexity

Complexity analysis describes how an algorithm's resource needs scale with input size.

## Common time complexities

| Complexity | Example |
| --- | --- |
| O(1) | Lookup by array index |
| O(log n) | Binary search on sorted data |
| O(n) | One pass through a list |
| O(n log n) | Efficient comparison sorting |
| O(n²) | Two nested loops over the same input |

## How to analyse a solution

1. Define the input size, usually as (n).
2. Count the dominant operations as input grows.
3. Simplify by ignoring constant factors and lower-order terms.
4. Consider best, average, and worst cases when they differ.
5. Track auxiliary memory separately from the input storage.

## Example: Two Sum with a hash map

The algorithm visits each value once and performs expected constant-time hash map operations.

- **Time:** O(n) expected.
- **Auxiliary space:** O(n) in the worst case.

Always mention assumptions when discussing performance, since data structures and implementation details can affect practical results.
