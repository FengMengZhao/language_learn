package org.fmz.concurrency;

import java.util.*;

public class OneValueCache{
    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i, BigInteger[] factors){
        lastNumber = i;
        lastFactors = Array.copy(factors, factors.length);
    }

    public BigInteger[] getFactors(BigInteger i){
        if(lastNumber == null || !lastNumber.equals(i))
            return null;
        else
            return Arrays.copy(lastFactors, lastFactors.length);
    }
}
