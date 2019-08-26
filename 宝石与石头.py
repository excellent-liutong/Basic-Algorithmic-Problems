class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        # j=list(J)
        # s=list(S)
        # sum=0
        # for i in s:
        #     if i in j:
        #         sum+=1
        # return sum
        return len([i for i in S if i in J])
