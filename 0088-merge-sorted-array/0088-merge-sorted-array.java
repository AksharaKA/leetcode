class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num=m+n;
        int[] res = new int[num];
        for(int i=0;i<m;i++)
        {
            res[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            res[m]=nums2[i];
            m++;
        }
        m=num;
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(res[j]<res[i])
                {
                    int temp;
                    temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            nums1[i]=res[i];
        }
    }
}