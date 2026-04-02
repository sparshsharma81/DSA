import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        //to convert interger to binary---there is inbuild method
        //Integer.toBinaryString(number)

        //and vice versa --- Integer.parseInt(number,2) --usually it is 2 for binary convert
        

        // int a1 = Integer.parseInt(String.valueOf(a),2);
        // int b1 = Integer.parseInt(String.valueOf(b),2);
        BigInteger a1 = new BigInteger(a,2);
        BigInteger b1 = new BigInteger(b,2);
        return (a1.add(b1).toString(2));


    }
}
