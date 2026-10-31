
       // return type string hai to 
       //Integer.parseInt(a, 2);
       //a → jis string ko convert karna hai.
       // 2 → original number ka base, yaani binary (base 2).

 import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);

        BigInteger sum = x.add(y);

        return sum.toString(2);
    }
}
