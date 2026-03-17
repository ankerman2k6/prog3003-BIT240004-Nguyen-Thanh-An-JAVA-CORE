package org.example.ex2;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer vlcPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playVlc(fileName);
        }
    }
}
