package org.fmz.pattern;

import java.io.*;

public class FileLoggerFactory extends LoggerFactory {


    public Logger getLogger() {

        Logger log = null;

        try{
            log = new FileLogger(System.getProperty("log.file"));
        }catch(IOException e){
            e.printStackTrace();
        }

        return log;
    }
}
