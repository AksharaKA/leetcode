class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++)
        {   int count=0;
            int a=nums[i];
            for(int j=0;j<len;j++)
            {
                if(a==nums[j])
                {
                    count++;
                }
            }
            if(count<3)
                {
                    return a;
                }
        }
        return 0;
    }
}