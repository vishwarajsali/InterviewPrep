class Solution:
    def isPalindrome(self, s: str) -> bool:

        left, right = 0, len(s) - 1

        while left < right:
            leftChar = s[left]
            rightChar = s[right]

            while left < right and not self.isAlphNum(leftChar):
                left += 1
                leftChar = s[left]

            while left < right and not self.isAlphNum(rightChar):
                right -= 1
                rightChar = s[right]

            leftChar = leftChar.lower()
            rightChar = rightChar.lower()

            if leftChar != rightChar:
                return False

            left += 1
            right -= 1

        return True

    def isAlphNum(self, c: str) -> bool:
        return (
            ('a' <= c <= 'z') or
            ('A' <= c <= 'Z') or
            ('0' <= c <= '9')
        )