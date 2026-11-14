class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        output = 0
        for i in stones:
            if i in jewels:
                output += 1
        return output