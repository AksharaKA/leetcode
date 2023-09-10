class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int max=0;
       int max1=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n&&prices[j]>prices[i];j++)
           {
               if(prices[j]>prices[i])
                   max1=prices[j]-prices[i];
               if(max1>max)
               {
                   max=max1;
               }
           }
       } 
       return max;
    }
}