package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(member));

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요: ");
            System.out.print("> ");
            String delete = sc.next();
            int foundIndex = -1; // 삭제할 별명이 발견된 인덱스

            // 삭제할 별명을 찾고 해당 별명의 인덱스를 저장
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(delete)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                // 별명이 발견되었을 경우
                String[] temp = new String[member.length - 1];
                for (int i = 0, j = 0; i < member.length; i++) {
                    if (i != foundIndex) {
                        temp[j++] = member[i];
                    }
                }
                member = temp;
                System.out.printf("%s의 별명을 삭제합니다.\n", delete);
            } else {
                // 별명이 발견되지 않았을 경우
                System.out.printf("해당 별명 %s은(는) 존재하지 않습니다.\n", delete);
            }

            System.out.println("삭제 후 정보: " + Arrays.toString(member));

            // 더 이상 삭제할 별명이 없는지 물어봄
            System.out.print("더 삭제하시겠습니까? (네/아니요): ");
            String answer = sc.next();
            if (!answer.equalsIgnoreCase("네")) {
                break;
            }
        }
    }
}
