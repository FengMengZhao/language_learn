package org.fmz.pattern;

import java.io.*;

public class FileLogger implements Logger{
    private PrintStream out;

    FileLogger(String file) throws IOException{
        out = new PrintStream(new FileOutputStream(file), true);
    }

    public void error(String msg){
        out.println("ERROR: " + msg);
    }

    public void debug(String msg){
        out.println("DEBUG: " + msg);
    }
}
