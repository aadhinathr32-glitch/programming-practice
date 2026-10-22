"""Find two indices in a sorted list whose values sum to target.

Returns zero-based indices, or an empty list if no pair exists.
Time: O(n). Auxiliary space: O(1).
"""
def two_sum_sorted(values: list[int], target: int) -> list[int]:
    left, right = 0, len(values) - 1
    while left < right:
        total = values[left] + values[right]
        if total == target:
            return [left, right]
        if total < target:
            left += 1
        else:
            right -= 1
    return []

if __name__ == "__main__":
    assert two_sum_sorted([1, 2, 4, 6, 10], 8) == [1, 3]
    assert two_sum_sorted([1, 2, 3], 10) == []
    assert two_sum_sorted([], 5) == []
    print("All Sorted Two Sum examples passed.")
