package org.fmz.pattern;

public class ConsoleLoggerFactory extends LoggerFactory{

    public Logger getLogger(){
        return new ConsoleLogger();
    }
}
