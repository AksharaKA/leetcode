class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        if target%2==0:
            half = target/2
            count=0
            inds = []
            for i,num in enumerate(nums):
                if num==half:
                    count+=1
                    inds.append(i)
            if count>=2:
                return inds[:2]

        d = {}

        for i,num in enumerate(nums):
            d[num] = [target - num, i]

        for k,v in d.items():
            num1 = k
            num2 = v[0]
            print(num1,num2)
            if num2 in d.keys() and d[num1][1]!=d[num2][1]:
                return d[num1][1],d[num2][1]
