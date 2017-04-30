package org.fmz.pattern;

public class AdapterPatternDemo{
    public static void main(String arg[]){
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "fmz");
        ap.play("mp4", "fmz");
        ap.play("vlc", "fmz");
        ap.play("avi", "fmz");
    }
}
