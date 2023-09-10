class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int no =len/2 +1;
        for(int i=0;i<len;i++)
        {   int count=1;
            for(int j=i+1;j<len;j++)
            {
                if(nums[j]==nums[i])
                count++;
            }
            System.out.println(nums[i]+" "+count);
            if(count==no)
            {
                return nums[i];
            }
        }   
        return 0;
    }
}