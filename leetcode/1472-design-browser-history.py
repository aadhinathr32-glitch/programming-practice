"""LeetCode 1472: Design Browser History

Approach:
- Store visited URLs in a list and track the current page with an index.
- Visiting a new URL removes any forward history before appending it.
- Back and forward clamp the index to the valid history range.

Time complexity:
- visit: O(n) due to slicing the forward history.
- back: O(1)
- forward: O(1)
"""


class BrowserHistory:

    def __init__(self, homepage: str):
        self.history = [homepage]
        self.current = 0

    def visit(self, url: str) -> None:
        self.history = self.history[:self.current + 1]
        self.history.append(url)
        self.current += 1

    def back(self, steps: int) -> str:
        self.current = max(0, self.current - steps)
        return self.history[self.current]

    def forward(self, steps: int) -> str:
        self.current = min(len(self.history) - 1, self.current + steps)
        return self.history[self.current]
