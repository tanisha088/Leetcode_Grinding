class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        dict1 = {}
        for i in range(0,len(nums)):
            val=0
            if nums[i] in dict1.keys():
                val =  dict1[nums[i]]
            dict1[nums[i]] = val+1
            
           
        
        res = []
        
        for i in range(1,1+len(nums)):
            if i in dict1.keys():
                continue
            else :
                res.append(i)
                
        return res