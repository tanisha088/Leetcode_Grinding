class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
     
        for i in range(0,len(stones)):
            stones[i] =  -1*stones[i]
            
        heapq.heapify(stones)
        
        while (len(stones)>1) :
            a=  heapq.heappop(stones)*-1
            b=  heapq.heappop(stones)*-1
            if a==b:
                continue
            else:
                heapq.heappush(stones,b-a)
            
        if len(stones)==0:
            return 0
        
        return stones.pop()*-1