package org.fmz.pattern;

public class LoggerFactoryTest{
    public static void main(String args[]) throws Exception{
        LoggerFactory f = LoggerFactory.getFactory("org.fmz.pattern.FileLoggerFactory");
        f.getLogger().error("I am not possible wrong!");
    }
}
