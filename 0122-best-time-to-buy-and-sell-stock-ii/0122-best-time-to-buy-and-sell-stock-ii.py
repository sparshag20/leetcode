class Solution(object):
    def maxProfit(self, prices):
        prof=0
        min1=10000
        for i in prices:
            min1=min(min1,i)
            if(i>min1):
                prof+=(i-min1)
                min1=10000
                min1=min(min1,i)
        return prof        
        """
        :type prices: List[int]
        :rtype: int
        """
        