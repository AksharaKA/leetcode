class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int length = 0;
        char[] str = new char[len];
        int p = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) { 
                str[p] = Character.toLowerCase(c);
                length++;
                p++;
            }
        }

        int z = 0;
        char[] revstr = new char[length];

        for (int i = length - 1; i >= 0; i--) {
            revstr[z] = str[i];
            z++;
        }

        for (int i = 0; i < length; i++) {
            if (str[i] != revstr[i]) {
                return false;
            }
        }

        return true;
    }
}
