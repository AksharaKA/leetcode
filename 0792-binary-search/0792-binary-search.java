class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int len=nums.length;
        int a, b;
        a=0;
        b=len-1;
        while(a<=b)
        {   mid=(a+b)/2;
            if(target==nums[mid])
            return mid;
            else if(target>nums[mid])
            a=mid+1;
            else 
            b=mid-1;
            
        }
        return -1;
    }
}