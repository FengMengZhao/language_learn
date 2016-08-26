package org.fmz.io;

import java.io.*;

public class FormattedMemoryInput{

    public static void main(String args[]) throws IOException{
        // This is a Chinese character 中国人 
        try{
            ///*
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                        BufferedInputFile.read("/home/fmz/php_auto.log").getBytes()));
            //*/
            /*
            DataInputStream in = new DataInputStream(
                    new FileInputStream("/home/fmz/php_auto.log"));
            */
            while(true)
                System.out.print((char)in.readByte());
        }catch(EOFException e){
            System.err.println("End of stream");
        }
    }

}
