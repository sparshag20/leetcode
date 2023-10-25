class Solution(object):
    def maxProfit(self, prices):
        min1=100000
        prof=0
        for i in prices:
            min1=min(min1,i)
            prof=max(prof,i-min1)
        return prof    
        """
        :type prices: List[int]
        :rtype: int
        """
        