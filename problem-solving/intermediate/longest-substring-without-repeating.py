"""Length of the longest substring without repeated characters.

Sliding window. Time: O(n) expected. Space: O(k).
"""
def longest_unique_substring(text: str) -> int:
    last_seen: dict[str, int] = {}
    left = best = 0
    for right, character in enumerate(text):
        if character in last_seen and last_seen[character] >= left:
            left = last_seen[character] + 1
        last_seen[character] = right
        best = max(best, right - left + 1)
    return best

if __name__ == "__main__":
    assert longest_unique_substring("abcabcbb") == 3
    assert longest_unique_substring("bbbbb") == 1
    assert longest_unique_substring("") == 0
    assert longest_unique_substring("pwwkew") == 3
    print("All Longest Unique Substring examples passed.")
