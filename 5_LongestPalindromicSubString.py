class Solution:
                
    def longestPalindrome(self, s: str) -> str:
        
        res = ""
        res_ln = 0
        for i in range(len(s)):
            l,r=i,i
            while l>=0 and r<len(s) and s[l]==s[r]:
                # print("in while")
                if(r-l+1 > res_ln):
                    # print("in if")
                    res=s[l:r+1]
                    # print("res ",res)
                    res_ln = r-l+1
                    # print("res_ln ",res_ln)
                l-=1
                r+=1
            
            l,r=i,i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                # print("in while")
                if(r-l+1) > res_ln:
                    # print("in if")
                    res=s[l:r+1]
                    # print("res ",res)
                    res_ln = r-l+1
                    # print("res_ln ",res_ln)
                l-=1
                r+=1
        return res
