package org.fmz.pattern;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing vlc file. name: " + fileName);
    }

    @Override
    public void playMp4(String fileName){
        //System.out.println("Playing mp4 file. name: " + fileName);
    }
}
