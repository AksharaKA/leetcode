class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2];
        int p = 0;
        for(int i=0;i<len;i++)
        {   int count = 0;
            int a=nums[i];
            for(int j=0;j<len;j++)
            {
                if(a==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
                {
                    ans[p]=a;
                    p++;
                }
        }
        return ans;
    }
}