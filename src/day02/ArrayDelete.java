package day02;

import java.util.Arrays;

public class ArrayDelete {

    public static void main(String[] args) {

        // 배열에서 원하는 위치의 값 삭제하기
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;

        for (int i = targetIndex; i < numbers.length -1; i++) {
            numbers[i] = numbers[i+1];
        }

        // 위 (fori) 반복문과  아래(numbers)의 인덱스값을 넣어주는 코드는 같은 코드인데 반복문으로 코드를 짧게 만들어줌

//        numbers[2] = numbers[3];
//        numbers[3] = numbers[4];
//        numbers[4] = numbers[5];

        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }

        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
    }
}
