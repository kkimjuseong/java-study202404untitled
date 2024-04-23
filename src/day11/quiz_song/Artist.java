package day11.quiz_song;

import java.util.HashSet;
import java.util.Set;

// 1개의 가수 정보
public class Artist {

    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    // 생성자
    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>(); // 비어있는 set
    }

    public boolean addSong(String songName) {
        return this.songList.add(songName);
    }

    public Set<String> getSongList() {
        return this.songList;
    }

}