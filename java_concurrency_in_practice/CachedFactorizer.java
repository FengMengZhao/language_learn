package org.fmz.concurrency;

public class CachedFactorizer{
    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cachedHits;

    public synchronized long getHits(){
        return hits;
    }

    public synchronized double getCachedHitRadio(){
        return (double) cachedHits / (double)hits;
    }

    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = null;
        synchronized(this){
            ++hits;
            if(i.equals(lastNumber)){
                ++cachedHits;
                factors = lastFactors.clone();
            }
        }
        if(factors == null){
            factors = factors(i);
            synchronized(this){
                lastNumber = i;
                lastFactors = factors.clone();
            }
        }
        encodeIntoResponse(resp, factors);
    }
}
