import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger x, y;
        x = new BigInteger(a, 2); 
        y = new BigInteger(b, 2); 
        BigInteger sum = x.add(y); 
        return sum.toString(2); 
}
}