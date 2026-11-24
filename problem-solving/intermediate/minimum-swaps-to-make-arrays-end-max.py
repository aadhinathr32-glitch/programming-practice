class Solution:
    def minOperations(self, nums1, nums2):
        # Try two cases:
        # 1. Keep the last pair as it is.
        # 2. Swap the last pair.
        def check(swap_last):
            a = nums1[:]
            b = nums2[:]

            operations = 0

            if swap_last:
                a[-1], b[-1] = b[-1], a[-1]
                operations = 1

            max_a = a[-1]
            max_b = b[-1]

            for i in range(len(a) - 1):
                if a[i] > max_a or b[i] > max_b:
                    # We need to swap this index.
                    if b[i] <= max_a and a[i] <= max_b:
                        operations += 1
                    else:
                        return float("inf")

            return operations

        answer = min(check(False), check(True))

        return -1 if answer == float("inf") else answer
