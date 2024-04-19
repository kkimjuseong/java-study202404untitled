package day09.book;

import Util.SimpleInput;

// 역할 : 도서관리 프로그램에서 입출력을 담당하는 객체

public class LibraryView {

    // 회원 정보를 입력받는 기능


    private static final LibraryRepository repository;
    private static BookUser currentUser;
    static SimpleInput si;

    static {
        repository = new LibraryRepository();
        // 도서 추가
        repository.addBook(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
        repository.addBook(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
        repository.addBook(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
        repository.addBook(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
        repository.addBook(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
        repository.addBook(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));

    }

    LibraryView(){
        si = new SimpleInput();
    }

    public static void makeNewBookUser(){
        System.out.print("# 회원 정보를 입력해주세요!\n");
        String name = SimpleInput.input("- 이름: ");
        // 나이 입력 및 유효성 검사
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            String ageInput = SimpleInput.input("- 나이: ");
            try {
                age = Integer.parseInt(ageInput);
                if (age > 0) {
                    validAge = true;
                } else {
                    System.out.println("잘못된 나이입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("나이는 숫자로 입력해주세요.");
            }
        }

        // 성별 입력 및 유효성 검사
        Gender gender;
        while (true) {
            String genderInput = SimpleInput.input("- 성별 (M/F): ").toUpperCase();
            if (genderInput.equals("M")) {
                gender = Gender.MALE;
                break;
            } else if (genderInput.equals("F")) {
                gender = Gender.FEMALE;
                break;
            } else {
                System.out.println("잘못된 성별입니다. 다시 입력해주세요.");
            }
        }

        // 초기 쿠폰 수를 0으로 설정
        int couponCount = 0;

        // 새로운 BookUser 객체를 생성하고 currentUser에 저장
        currentUser = new BookUser(name, age, gender, couponCount);
//        System.out.println("회원 등록이 완료되었습니다.");

    }


    static String showProgramMenu() {
        System.out.println("\n======= 도서 메뉴 =======");
        System.out.println("* 1. 마이페이지");
        System.out.println("* 2. 도서 전체 조회");
        System.out.println("* 3. 도서 제목으로 검색");
        System.out.println("* 4. 도서 대여하기");
//        System.out.println("* 5. 도서 저자이름으로 검색");
        System.out.println("* 9. 프로그램 종료");

        String menuNember = SimpleInput.input(" - 메뉴 번호: ");
        return menuNember;
    }


    static boolean exitProgram() {
        String exit = SimpleInput.input("- 프로그램을 종료합니까? [y/n]");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        } else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }


    public static void start() {

        makeNewBookUser();

        while (true) {

            String menuNum = showProgramMenu();

            switch (menuNum) {
                case "1":
                    myPage();
                    break;
                case "2":
                    showBook();
                    break;
                case "3":
                    inputBookName();
                    break;
                case "4":
                    bookLend();
                    break;
                case "5":
                    inputBookSearch();
                    break;
                case "9":
                    boolean flag = exitProgram();
                    if (flag) return;
                default:
                    System.out.println("잘못 입력하셨습니다!");
            } // end switch
        } // end while
    }


    private static void myPage() {
        if (currentUser == null) {
            System.out.println("로그인된 사용자가 없습니다.");
            return;
        }

        System.out.println("********* 회원님 정보 *********");
        System.out.printf("이름: %s\n", currentUser.getName());
        System.out.printf("나이: %d\n", currentUser.getAge());
        System.out.printf("성별: %s\n", currentUser.getGenderToString());
        System.out.printf("쿠폰 수: %d\n", currentUser.getCouponCount());
    }

    private static void showBook() {
        System.out.println("========== 모든 도서 정보 ==========");
        repository.showAllBooks();
    }
    private static void inputBookName() {
        // 사용자가 입력한 도서 제목을 받습니다.
        String title = si.input("# 검색어: ");
        // 도서 제목으로 검색합니다.
        System.out.printf(" ========= [%s]의 검색 결과 =========\n", title);
        repository.searchBookByTitle(title);
    }


    private static void bookLend() {
        // 도서 대여하기.
        repository.lendBook();
    }

    private static void inputBookSearch() {
        // 도서 저자 이름이로 검색하기.

    }


}
