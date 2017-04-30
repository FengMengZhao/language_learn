package org.fmz.pattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter ma;

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equals("mp3"))
            System.out.println("Playing mp3 file. name: " + fileName);
        else if(audioType.equals("mp4") || audioType.equals("vlc")){
            ma = new MediaAdapter(audioType);
            ma.play(audioType, fileName);
        }else
            System.out.println("Invalid media. " + audioType + " format not supported");
    }
}
