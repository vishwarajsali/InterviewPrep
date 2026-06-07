class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        parenthDict = {"}": "{", ")": "(", "]": "["}

        for c in s:
            if c in parenthDict:
                if stack and stack[-1] == parenthDict[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return True if not stack else False
