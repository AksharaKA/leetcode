class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        if(target<nums[0])
        {
            return 0;      
        }
        else if(target>nums[len-1])
        {
            return len;
        }
        else
        {   
            for(int i=1;i<len;i++)
            {
                if(target<nums[i])
                {
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}