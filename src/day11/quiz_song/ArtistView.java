package day11.quiz_song;

import Util.SimpleInput;

import java.util.HashSet;
import java.util.Set;


// 프로그램의 입출력 처리 담당.
public class ArtistView {

    /*
    NullPointerException 오류가 발생하는 원인을 살펴보면,
    ArtistView 클래스 내에서 repository 와 si 객체를 정적(static) 변수로 선언하고 있습니다.
    이 두 객체는 ArtistView 의 생성자에서 인스턴스화되고 있습니다. 하지만 start()와 RegisteringSong()
    메소드는 정적 메소드로 선언되어 있어 이 메소드들이 호출될 때 ArtistView 의 인스턴스가 생성되지 않았을 수도 있습니다.
    이 경우 repository 와 si가 초기화되지 않아 NullPointerException 이 발생할 수 있습니다.
     */

    private static final ArtistRepository repository = new ArtistRepository();
    private static final SimpleInput si = new SimpleInput();

    // 프로그램 실행
    public static void start() {
        repository.load();

        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.printf("# 현재 등록된 가수: %d명\n", repository.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("=======================");

            String menuNum = si.input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("# 메뉴를 잘못 선택했습니다.");
            }
        }
    }

    // 1번 메뉴 : 노래 등록에 대한 입출력 처리
    private static void insertProcess() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        String artistName = si.input("- 가수명: ");
        String songName = si.input("- 노래명: ");

        // 결과 화면 출력
        if (!repository.isRegistered(artistName)) { // 신규 등록인가???
            // 실제로 가수정보를 등록해야 하는데 - 어디에?? map 에 저장해!
            repository.addNewArtist(artistName, songName);
            System.out.printf("\n# %s님이 신규등록되었습니다.\n", artistName);

        } else { // 신규 등록이 아니라 기존 등록 가수에 곡명만 추가하는 것인가?

            // 새로운 노래를 추가해본다. 추가가 잘되었는지 여부를 확인한다.
            boolean flag = repository.addNewSong(artistName, songName);

            if (flag) { // 기존 가수의 트랙리스트에 노래만 추가하는 경우
                System.out.printf("\n# %s님이 노래목록에 %s곡이 추가되었습니다.\n", artistName, songName);
            } else { // 노래가 중복된 경우
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }
        }

        // 등록된 내용 세이브 파일에 저장하기.
        repository.save();


    }

    private static void searchProcess() {
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = si.input("- 가수명: ");

        if (repository.isRegistered(artistName)) { // 검색한 가수가 저장되어 있다면

            // 노래목록 가져와 출력하게~~
            Set<String> songList = repository.getSongList(artistName);

            int num = 1;
            System.out.printf("\n# %s님의 노래목록 \n", artistName);
            System.out.println("==============================");
            for (String song : songList) {
                System.out.printf("# %d. %s\n", num++, song);
            }

        } else { // 없는 가수라면
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }
    }

}
