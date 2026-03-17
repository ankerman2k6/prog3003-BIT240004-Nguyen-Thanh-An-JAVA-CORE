package org.example.ex2;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("...Đang phát file MP3 "+ fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else System.out.println("Định dạng " + audioType +" Không được hỗ trợ");
    }
}
