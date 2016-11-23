package org.fmz.algorithm;

public class GetMaxCommonDivisor{
    public int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String args[]){
        System.out.println(new GetMaxCommonDivisor().gcd(15, 125));
    }
}
