package org.fmz.pattern;

import java.lang.reflect.*;

public class ProxyHandler implements InvocationHandler{

    private Subject subject;

    public ProxyHandler(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception{

        System.out.println("=====before=====");
        Object result = method.invoke(subject, args);
        System.out.println("=====after=====");
        return result;
    }
}
