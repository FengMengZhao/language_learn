package org.fmz.concurrency;

public class CountingFactorizer implements Service{
    private final AtomicLong counter = new AtomicLong(0);

    public long getCounter(){
        return counter.get();
    }

    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);
        counter.incrementAndGet();
        encodeIntoResponse(resp, factors);
    }
}
