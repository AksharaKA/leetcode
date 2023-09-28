class Solution {
    public int maxSum(int[] nums) {
        int len=nums.length;
        int[] max=new int[len];
        int[] num=new int[len];
        for(int i=0;i<len;i++)
        {
            num[i]=nums[i];
        }
        int number=0;
        for(int i=0;i<len;i++)
        {   int maxnum=0;
            while(nums[i]>0)
            {
                number=nums[i]%10;
                nums[i]=nums[i]/10;
                if(number>maxnum)
                maxnum=number;
            }
            max[i]=maxnum;
        }
        int maximum=-1;
        int res=-1;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(max[i]==max[j])
                {
                    maximum=num[i]+num[j];
                    if(maximum>res)
                    res=maximum;
                }
            }
        }
        return res;
    }
}