package org.fmz.concurrency;

public class UnsafeCachingFactorizer implements Servlet{
    private final AtomicReference<BigInteger> lastNumber = 
        new AtomicReference<>();
    private final AtomicReference<BigInteger[]> lastFactors = 
        new AtomicReference<>();

    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);

        if(i.equals(lastNumber.get()))
            encodeIntoResponse(resp, lastFactors.get());
        else{
            BigInteger[] factors = factor(i);
            lastNumber.set(i);// race condition
            lastFactors.set(factors);// race condition
            encodeIntoResponse(resp, lastFactors.get());
        }
    }
}

