package org.fmz.coucurrency;

import java.util.*;
import java.io.*;

public class ThreadSafeDownLoader extends Thread{
    private InputStream in;
    private OutputStream out;
    private ArrayList<ProgressListener> listeners;

    public DownLoader(URL url, String outputFileName) throw IOException{
        in = url.openConnection().getInputStream();
        out = new FileOutputStream(outputFileName);
        listeners = new ArrayList<ProgressListener>();
    }

    public synchronized void add(ProgressListener listener){
        listeners.add(listener);
    }

    public synchronized void removeListener(ProgressListener listener){
        listeners.remove(listener);
    }

    // This is not thread-safe, because updateProcess() calls an alien method - a method it knows nothing about
    private void updateProgress(int n){
        ArrayList<ProgressListener> listenersCopy;
        synchronized(this){
            listenersCopy = (ArrayList<ProgressListener>)listeners.clone();
        }
        for(ProgressListener listener : listenersCopy)
            listener.onProcess(n);
    }

    public void run(){
        int n = 0,
            total = 0;
        byte[] buffer = new byte[1024];

        try{
            while((n = in.read(buffer)) != -1){
                out.write(buffer, 0, n);
                total += n;
                updateProcess(total);
            }
            out.flush();
        }catch(IOException e){}
    }
}
