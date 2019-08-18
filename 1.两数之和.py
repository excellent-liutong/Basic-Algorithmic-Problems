#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#
class Solution:
    # @return a tuple, (index1, index2)
    # 8:42
    def twoSum(self, num, target):
        map = {}
        for i in range(len(num)):
            if num[i] not in map:
                map[target - num[i]] = i + 1
            else:
                return map[num[i]], i + 1

        return -1, -1
        

