package ru.Fibonacci.main;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMain {
    private static Map<Integer, BigInteger> mapa = new HashMap<Integer, BigInteger>();

    public static void main(String[] args) {
    }

    public static BigInteger fibonacciSequence (int n){
        if (n == 0 || n == 1) return BigInteger.ONE;
        if (mapa.containsKey(n)) return mapa.get(n);
        BigInteger v = fibonacciSequence(n-2).add(fibonacciSequence(n-1));
        mapa.put(n, v);
        return v;
    }

    public static int calculateZero (BigInteger n){
        int zeroCount = 0;
        BigInteger num = n;
        while (num.compareTo(BigInteger.ZERO) > 0) {
            if (num.remainder(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0) {
                zeroCount++;
                num = num.divide(BigInteger.TEN);
            } else {
                num = num.divide(BigInteger.TEN);
            }
        }
        return zeroCount;
    }

    public static int zeroInFibonacci (int n){
       BigInteger fibonacci = fibonacciSequence(n);
        return calculateZero(fibonacci);
    }
}
