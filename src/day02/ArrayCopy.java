package day02;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
//        String[] petsCopy = pets; // 배열 복사가 아니라 배열 주소복사
        String[] petsCopy = new String[pets.length];

        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        // 새로운 방을 만들고 그 방에다가 기존 값을을 옮겨주는게 배열복사임 for문사용 위 내용

        pets[1] = "냥냥이"; // 복사 후 원본 수정

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));
    }
}
