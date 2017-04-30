package org.fmz.concurrency;

public class UnsafeCountingFactorizer implements Service{
    private long counter = 0;

    public long getCounter(){
        return counter;
    }

    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        ++counter;
        encodeIntoResponse(resp, factors);
    }
}
