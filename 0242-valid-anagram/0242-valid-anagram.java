class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        int flag=0;
        char[] arr=new char[len2];
        int p=0;
        int j;
        for(int i=0;i<len2;i++)
        {
            arr[i]=t.charAt(i);
            p++;        
        }
        if(len1!=len2)
        return false;
        else
        {
            for(int i=0;i<len1;i++)
            {
                char c=s.charAt(i);
                for(j=0;j<len2;j++)
                {
                    if(c==arr[j])
                    {
                        flag=1;
                        arr[j]=' ';
                        break;
                    }
                }
                if(len2==j)
                {
                    return false;
                }
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }
}