class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
        int[] newarray=new int[len];
        int p=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2==0)
            {
                newarray[p]=nums[i];
                p++;
            }
        }
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2!=0)
            {
                newarray[p]=nums[i];
                p++;
            }
        }
        return newarray;
    }
}