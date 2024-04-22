package day10.inter.quiz_interface_;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지를 재생합니다.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
