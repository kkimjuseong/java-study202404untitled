package day10.inter.quiz_interface_;

import java.util.Arrays;

public class MediaPlayer{

    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media 를 mediaList 배열에 추가
        MediaPlayable[] newMediaList = new MediaPlayable[mediaList.length + 1];

        // 위 newMediaList 를 만들지 않고 아래처럼 만들면 for 반복문까지 해결가능
        // MediaPlayable[] newMediaList = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사


        // 밑에 for문을 안돌려도 배열복사가 가능함

        for (int i = 0; i < mediaList.length; i++) {
            newMediaList[i] = mediaList[i];
        }

        newMediaList[newMediaList.length - 1] = media;
        this.mediaList = newMediaList;
    }

    public void playAll() {
        // 반복문을 통해 mediaList 에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable media : mediaList) {
            media.play();
        }

//        for (int i = 0; i < mediaList.length; i++) {
//            mediaList[i].play();
//        }


    }

}
