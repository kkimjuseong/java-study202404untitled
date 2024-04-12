package day05;

import java.util.Arrays;

// 스트링 배열을 관리하는 객체의 설계도
public class StringList {

    //스트링 배열을 필드로 등록
    String[] sArr;

    // 생성자를 통해 스트링 배열을 초기화 함
    StringList() {
        sArr = new String[0];
    }

    // 배열 내부를 출력하는 메서드
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열 내부 요소의 수를 알려주는 메서드
    int size() {
        return sArr.length;
    }

    // 배열의 맨 끝에 추가하는 메서드
    void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[sArr.length] = newData;
        sArr = temp;
    }

    // 배열 맨 끝데이터 제거
    void pop() {
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }

    // 중간 삭제 (remove) : 값으로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length) return;
        if (index == sArr.length) push(newData);

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    // 배열 데이터 수정
    public void set(int index, String newData) {
        if (index < 0 || index > sArr.length) return;
        sArr[index] = newData;
    }

    // 배열 데이터 전체 삭제
    public void clear() {
        sArr = new String[0];
    }



//    void hobbies(String... nHobbies) {
//        for (String hobby : nHobbies) {
//            hobbies.push(hobby);
//        }
//    }

}


