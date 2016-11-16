package org.fmz.pattern;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer amp;
    public MediaAdapter(String audioType){
        if(audioType.equals("vlc"))
            amp = new VlcPlayer();
        else if(audioType.equals("mp4"))
            amp = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equals("vlc"))
            amp.playVlc(fileName);
        else if(audioType.equals("mp4"))
            amp.playMp4(fileName);
    }
}
