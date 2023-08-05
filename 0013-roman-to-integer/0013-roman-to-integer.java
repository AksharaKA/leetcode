class Solution {
    public int romanToInt(String s) {
        String copy=s;
        int n = 0;
        n = copy.length();
        int num=0;
        char a;
        char b;
        for(int i=0;i<n;i++)
        {   a=copy.charAt(i);
            if(i>0)
            {
                b=copy.charAt(i-1);
                if(a=='V'&&b=='I'||a=='X'&&b=='I')
                {
                    num=num-2;
                }
                else if(a=='L'&&b=='X'||a=='C'&&b=='X')
                {
                    num=num-20;
                }
                else if(a=='D'&&b=='C'||a=='M'&&b=='C')
                {
                    num=num-200;
                }
            }
            if(a=='V')
            {
                num+=5;
            }
            else if(a=='I')
            {
                num+=1;
            }
            else if(a=='X')
            {
                num+=10;
            }
            else if(a=='M')
            {
                num+=1000;
            }
            else if(a=='L')
            {
                num+=50;
            }
            else if(a=='C')
            {
                num+=100;
            }
            else if(a=='D')
            {
                num+=500;
            }
        }
        return num;
    }
}