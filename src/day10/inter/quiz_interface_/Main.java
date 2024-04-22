package day10.inter.quiz_interface_;

public class Main {

        public static void main(String[] args) {
            MediaPlayer player = new MediaPlayer();
            player.addMedia(new VideoPlayer());
            player.addMedia(new AudioPlayer());
            player.addMedia(new ImageDisplay());

            player.playAll();  // 모든 미디어 파일 재생 (각각의 play 메서드 호출)

        }
}
