package Stolyarov_S;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static BigInteger factorial(int value) {
        BigInteger result=new BigInteger("1");
        for (int i = 1; i <= value; i++) {
             BigInteger iValue=new BigInteger(String.valueOf(i));
             result=result.multiply(iValue);
        }
        return result;
    }
}
