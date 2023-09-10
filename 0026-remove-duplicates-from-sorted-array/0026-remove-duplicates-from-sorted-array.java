class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count=0;
        for (int i = 0; i < len; i++) {
            int val=nums[i];
            for(int j=i+1;j<len;j++)
            {   int p=j;
                if (nums[j] == val) {
                for (int k = j + 1; k < len; k++) {
                    nums[j] = nums[k];
                    j++;
                }
                len--;
                j=p-1;; 
            }
            }
            
        }
        return len;
    }
}