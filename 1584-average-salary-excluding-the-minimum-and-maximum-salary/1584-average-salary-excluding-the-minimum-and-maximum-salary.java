class Solution {
    public double average(int[] salary) {
        int len=salary.length;
        double max=0;
        double min=salary[0];
        for(int i=0;i<len;i++)
        {
            if(salary[i]>max)
            max=salary[i];
            if(salary[i]<min)
            min=salary[i];
        }
        double sum =0;
        double average=0;
        int n=0;
        for(int i=0;i<len;i++)
        {   if(salary[i]!=min && salary[i]!=max)
            {   
                sum+=salary[i];
                n++;
            }
        }
        System.out.println(n);
        System.out.println(sum);
        if(n!=0)
        average=sum/n;
        return average;
    }
}