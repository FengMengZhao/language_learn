package org.fmz.io;

import java.io.*;

public class MemoryInput{
    public static void main(String args[]) throws IOException{
        StringReader in = new StringReader(BufferedInputFile.read("io/MemoryInput.java"));

        // this is the character 冯
        int c;
        while((c = in.read()) != -1){
            if(c != '冯')
                System.out.print((char)c);
            else
                System.out.print("孟昭");
        }
    }
}
