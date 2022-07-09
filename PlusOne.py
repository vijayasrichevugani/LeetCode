class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=""
        for i in range(len(digits)):
            s+=str(digits[i])
        s1=int(s)+1
        return list(map(int, str(s1)))
