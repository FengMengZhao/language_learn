package org.fmz.concurrency;

public class ReentrantSynchronizationExample{
    public synchronized void a(){
        System.out.println("Calling method b() from a()");
        b();
    }

    public synchronized void b(){
        System.out.println("Calling method c() from b()");
        c();
    }

    public synchronized void c(){
        System.out.println("Hello from method c()");
    }
}
