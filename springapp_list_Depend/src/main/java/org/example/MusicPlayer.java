package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        musicList.stream().forEach(x->System.out.println(x.getSong()));
//        System.out.println("Playmusic :" + music.getSong());
    }

//    public void setMusicList(JazzMusic musicList) {
//    }
}
