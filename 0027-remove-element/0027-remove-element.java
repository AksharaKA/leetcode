class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==val)
            count++;
        }
        for (int i = 0; i < len; i++) {
            int p=i;
            if (nums[i] == val) {
                for (int j = i + 1; j < len; j++) {
                    nums[i] = nums[j];
                    i++;
                }
                len--;
                i=p-1;; 
            }
        }
        return len;
    }
}