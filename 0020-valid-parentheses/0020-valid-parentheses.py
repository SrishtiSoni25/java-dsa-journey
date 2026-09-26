class Solution(object):
    def isValid(self, s):
        stack = []

        pairs = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        for char in s:

            if char in '({[':
                stack.append(char)

            else:
                if not stack:
                    return False

                if stack.pop() != pairs[char]:
                    return False

        return len(stack) == 0