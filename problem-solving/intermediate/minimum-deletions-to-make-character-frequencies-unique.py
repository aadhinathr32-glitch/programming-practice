class Solution:
    def minDeletions(self, s):
        freq = {}

        # Count frequency of each character
        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1

        used = set()
        deletions = 0

        for count in freq.values():
            # Reduce the frequency until it becomes unique
            while count > 0 and count in used:
                count -= 1
                deletions += 1

            if count > 0:
                used.add(count)

        return deletions
