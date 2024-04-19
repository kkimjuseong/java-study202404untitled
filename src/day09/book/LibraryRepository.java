package day09.book;


import Util.SimpleInput;

// 역할 : 도서관리 앱에서 사용하는 데이터들을 관리하는 객체
// 관리할 데이터 : 우리 회원이 누구? 우리는 어떤책들을 갖고 있는가?


public class LibraryRepository {
    private static Book[] bookList;
    private static int bookCount;
    private static BookUser currentUser;
    static SimpleInput si;
    static BookList bl;


    LibraryRepository() {
        currentUser = new BookUser();
        bookList = new Book[10];
        bookCount = 0;
        si = new SimpleInput();

    }

    public void addBook(Book book) {
        // 배열에 공간이 있는지 확인
        if (bookCount < bookList.length) {
            // 배열에 도서를 추가
            bookList[bookCount] = book;
            // 도서 목록의 크기를 증가
            bookCount++;
        } else {
            System.out.println("도서 목록이 가득 찼습니다. 추가할 수 없습니다.");
        }
    }

    public void showAllBooks() {
        // 배열의 각 요소를 반복하며 도서 정보를 출력합니다.
        for (int i = 0; i < bookCount; i++) {
            System.out.println(bookList[i].toString());
        }
    }


    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : bookList) {
            if (book != null && book.getTitle() != null && book.getTitle().contains(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void lendBook() {
        System.out.println("========= 대여 가능한 도서 정보 =========");
        showAllBooks();
        String number = si.input("# 대여할 도서 번호 입력: ");

        // 사용자가 입력한 도서 번호를 정수로 변환
        int bookNumber = Integer.parseInt(number);

        // 도서 번호가 유효한지 확인
        if (bookNumber >= 0 && bookNumber < bookCount) {
            Book bookToLend = bookList[bookNumber];

            // 도서 대여 로직
            if (bookToLend instanceof CookBook) {
                CookBook cookBook = (CookBook) bookToLend;
                // 쿠폰이 있는 경우 회원의 쿠폰 수 증가
                if (cookBook.isCoupon()) {
                    currentUser.setCouponCount(currentUser.getCouponCount() + 1);
                    System.out.println("쿠폰이 증가했습니다!");
                }
            }
            // 도서 대여 완료 메시지 출력
            System.out.println("도서 대여를 성공하였습니다.");
        } else {
            System.out.println("잘못된 도서 번호입니다.");
        }
    }



}

