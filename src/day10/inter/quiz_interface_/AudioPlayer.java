package day10.inter.quiz_interface_;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오가 일시정지 됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오를 멈춥니다.");
    }
}
