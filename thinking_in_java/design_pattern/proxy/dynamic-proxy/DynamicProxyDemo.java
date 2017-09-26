package org.fmz.pattern;

import java.lang.reflect.*;

public class DynamicProxyDemo{
    public static void main(String arg[]){

        RealSubject realSubject = new RealSubject();
        ProxyHandler handler = new ProxyHandler(realSubject);
        Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);

        proxySubject.request();
    }
}
