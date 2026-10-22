"""Regression tests for the Python problem-solving examples."""
import importlib.util
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]

def load_solution(relative_path: str, module_name: str):
    path = ROOT / relative_path
    spec = importlib.util.spec_from_file_location(module_name, path)
    if spec is None or spec.loader is None:
        raise ImportError(f"Cannot load solution at {path}")
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module

def test_two_sum():
    solution = load_solution("problem-solving/easy/two-sum.py", "two_sum")
    assert solution.two_sum([2, 7, 11, 15], 9) == [0, 1]
    assert solution.two_sum([3, 3], 6) == [0, 1]
    assert solution.two_sum([1, 2], 8) == []

def test_valid_anagram():
    solution = load_solution("problem-solving/easy/valid-anagram.py", "valid_anagram")
    assert solution.is_anagram("listen", "silent")
    assert not solution.is_anagram("hello", "world")
    assert solution.is_anagram("", "")

def test_first_non_repeating_character():
    solution = load_solution("problem-solving/easy/first-non-repeating-character.py", "first_non_repeating_character")
    assert solution.first_non_repeating("swiss") == "w"
    assert solution.first_non_repeating("aabb") is None
    assert solution.first_non_repeating("") is None

def test_remove_duplicates_preserves_order():
    solution = load_solution("problem-solving/easy/remove-duplicates.py", "remove_duplicates")
    assert solution.remove_duplicates([1, 2, 1, 3, 2]) == [1, 2, 3]
    assert solution.remove_duplicates([]) == []

def test_valid_parentheses():
    solution = load_solution("problem-solving/easy/valid-parentheses.py", "valid_parentheses")
    assert solution.is_valid_parentheses("([]{})")
    assert not solution.is_valid_parentheses("(]")
    assert solution.is_valid_parentheses("")

def test_binary_search():
    solution = load_solution("problem-solving/easy/binary-search.py", "binary_search")
    assert solution.binary_search([1, 3, 5, 7], 5) == 2
    assert solution.binary_search([1, 3, 5, 7], 4) == -1
    assert solution.binary_search([], 1) == -1

def test_maximum_subarray_sum():
    solution = load_solution("problem-solving/intermediate/maximum-subarray-sum.py", "maximum_subarray_sum")
    assert solution.max_subarray_sum([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6
    assert solution.max_subarray_sum([-5, -2, -8]) == -2

def test_longest_unique_substring():
    solution = load_solution("problem-solving/intermediate/longest-substring-without-repeating.py", "longest_unique_substring")
    assert solution.longest_unique_substring("abcabcbb") == 3
    assert solution.longest_unique_substring("") == 0
    assert solution.longest_unique_substring("bbbbb") == 1

def test_merge_intervals():
    solution = load_solution("problem-solving/intermediate/merge-intervals.py", "merge_intervals")
    assert solution.merge_intervals([[1, 3], [2, 6], [8, 10]]) == [[1, 6], [8, 10]]
    assert solution.merge_intervals([[1, 4], [4, 5]]) == [[1, 5]]
    assert solution.merge_intervals([]) == []

def test_special_substrings():
    solution = load_solution("problem-solving/intermediate/special-substrings.py", "special_substrings")
    assert solution.can_select_special_substrings("abc", 2)
    assert solution.can_select_special_substrings("abc", 0)
    assert not solution.can_select_special_substrings("abc", 4)
