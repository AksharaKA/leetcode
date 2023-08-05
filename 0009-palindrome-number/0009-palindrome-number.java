class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int newx=0;
        int rem=0;
        while(copy>0)
        {
            rem=copy%10;
            newx=(newx*10)+rem;
            copy/=10;
        } 
        if(newx==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}