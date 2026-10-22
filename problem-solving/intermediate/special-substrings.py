"""Return whether at least k disjoint special substrings can be selected.

A special substring is non-empty, is not the whole string, and every character
inside it occurs nowhere outside it. The empty substring is not counted.
"""
def can_select_special_substrings(text: str, k: int) -> bool:
    if k <= 0:
        return True
    n = len(text)
    if n == 0:
        return False

    first: dict[str, int] = {}
    last: dict[str, int] = {}
    for i, char in enumerate(text):
        first.setdefault(char, i)
        last[char] = i

    candidates: list[tuple[int, int]] = []
    for char in first:
        start = first[char]
        end = last[char]
        i = start
        valid = True
        while i <= end:
            current = text[i]
            if first[current] < start:
                valid = False
                break
            end = max(end, last[current])
            i += 1
        if valid and not (start == 0 and end == n - 1):
            candidates.append((start, end))

    # Earliest-finish interval scheduling maximizes the number of disjoint candidates.
    candidates.sort(key=lambda interval: (interval[1], interval[0]))
    count = 0
    previous_end = -1
    for start, end in candidates:
        if start > previous_end:
            count += 1
            previous_end = end
            if count >= k:
                return True
    return False

if __name__ == "__main__":
    assert can_select_special_substrings("abc", 2)
    assert can_select_special_substrings("abc", 3)
    assert not can_select_special_substrings("abc", 4)
    assert can_select_special_substrings("abb", 1)
    assert can_select_special_substrings("abc", 0)
    print("All Special Substrings examples passed.")
