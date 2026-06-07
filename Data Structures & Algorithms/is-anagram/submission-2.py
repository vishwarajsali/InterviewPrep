class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        map = {}

        for i in range(len(s)):
            if s[i] not in map:
                map[s[i]] = 1
            else: 
                map[s[i]] += 1

            if t[i] not in map:
                map[t[i]] = -1
            else: 
                map[t[i]] -= 1
            
        
        for v in map.values():
            print(v)
            if v != 0:
                return False


            
            


        return True