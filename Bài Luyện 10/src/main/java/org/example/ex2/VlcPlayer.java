package org.example.ex2;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println(".....Đang chạy file nhạc VLC " + fileName);
    }
}
