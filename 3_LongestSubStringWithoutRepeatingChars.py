Class Solution:
  def __init__self(self, s:str) -> int:
    Char_set = set()
    res = 0
    l=0
    for r in range(len(s)):
      while s[r] in Char_set:
        Char_set.remove(s[l])
        l+=1
      Char_set.add(s[r])
      res = max(res,r+l-1)
      
    return res
