package day10.inter.quiz_interface_;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오를 재생합니다.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}