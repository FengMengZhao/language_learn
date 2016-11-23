package org.fmz.concurrecy;

public class VolatileCachedFactorizer{
    private volatile OneValueCache cache = new OneValueCache(null, null);

    public void service(ServiceRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = cache.getFactors(i);
        if(factors == null){
            factors = factor(i);
            cache = new OneValueCache(i, factors);
        }
        encodeIntoResponse(resp, factors);
    }
}
