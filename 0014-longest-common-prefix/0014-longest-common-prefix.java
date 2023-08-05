class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        int n;
        n=strs.length;
        int length=strs[0].length();
        int length2;  
        if(n>1)
        {   int i=0,j=0;
            int count=1;
            length2=strs[1].length();
            if(strs[0].length()>0&&strs[1].length()>0)
            {      if(strs[0].charAt(0)==strs[1].charAt(0))
                        {   prefix+=strs[0].charAt(0);
                            i++;
                            j++;
                            while(count!=0 && j!=length2 && i!=length)
                            {   if(strs[0].charAt(i)!=strs[1].charAt(j))
                                {
                                    count=0;
                                }
                                else
                                {   prefix+=strs[0].charAt(i);
                                    i++;
                                    j++;
                                }
                            }
                            
                            int prelen;
                            prelen=prefix.length();
                            count=1;
                            for(int m=2;m<n;m++)
                            {   if(strs[m].length()==0||prefix.charAt(0)!=strs[m].charAt(0))
                                {	count=0;
                                    prefix="";
                                    break;    
                                }                  
                            }
                            int p=1,q=1;
                            if(count!=0)
                            {   for(int m=2;m<n;m++)
                                { 
                                count=1; 
                                p=1;q=1;
                                String prefix1="";
                                prefix1+=prefix.charAt(0);
                                while(count!=0 && q!=strs[m].length() && p!=prefix.length())
                                {   if(strs[m].charAt(q)!=prefix.charAt(p))
                                    {
                                        count=0;
                                    }
                                    else
                                    {   
                                        prefix1+=strs[m].charAt(p);
                                        p++;
                                        q++;
                                    }
                                }
                                prefix=prefix1;
                                System.out.println(prefix); 
                                System.out.println(count); 
                                }

                            }
                        }
                        else
                        {
                            return prefix;
                        }  
            }
        }
        else
        {
            prefix=strs[0];
        }
        return prefix;
    }
}

