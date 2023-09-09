class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int j;
        int ans=0;
        for(int i=0;i<=len;i++)
        {
            for(j=0;j<len;j++)
            {
                if(i==nums[j])
                break;
            }
            if(j==len)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}