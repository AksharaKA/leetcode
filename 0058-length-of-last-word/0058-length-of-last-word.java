class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int count=0,c=0,lencount=0;
        if(len==1)
        return 1;
        for(int i=0;i<len;i++)
        {
            if(i!=len-1)
            {
                if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                {
                    count++;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            if(i!=len-1)
            {
                if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                {
                    c++;
                    if(c==count)
                    {
                        for(int j=i+1;j<len;j++)
                        {   if(s.charAt(j)!=' ')
                            lencount++;
                        }
                    }
                }
            }
            
        }
        if(lencount==0)
        {
            for(int i=0;i<len;i++)
            {
                if(s.charAt(i)!=' ')
                lencount++;
            }
        }
        return lencount;
    }
}