class Solution:
    def isValid(self, s: str) -> bool:
        staq = []
        for i in s:
            if i in ['(', '[', '{']:
                staq.append(i)
            elif i == ')':
                try:
                    assert staq.pop() == '('
                except:
                    return False
            elif i == ']':
                try:
                    assert staq.pop() == '['
                except:
                    return False
            elif i == '}':
                try:
                    assert staq.pop() == '{'
                except:
                    return False
        return True if not staq else False

a = Solution()
print(a.isValid(s = "()"))
print(a.isValid(s = "()[]{}"))
print(a.isValid(s = "(]"))
print(a.isValid(s = "([)]"))
print(a.isValid(s = "{[]}"))