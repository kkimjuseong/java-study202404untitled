package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(member));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요. ");
            System.out.print("> ");
            String targetName = sc.nextLine();

            int foundIndex = -1;

            // 수정할 별명을 찾고 해당 별명의 인덱스를 저장
            for (int i = 0; i < member.length; i++) {
                if (member[i].equals(targetName)) {
                    foundIndex = i;
                    break;
                }
            }

            // 찾은 별명이 없을 경우 오류 출력 후 다시 입력받기
            if (foundIndex == -1) {
                System.out.println("해당하는 별명이 존재하지 않습니다. 다시 입력하세요.");
                continue;
            }

            System.out.println("- 새로운 별명을 입력하세요. ");
            System.out.print("> ");
            String newMemberName = sc.nextLine();

            // 별명 수정
            member[foundIndex] = newMemberName;

            System.out.println("- 수정 후 학생들의 별명: " + Arrays.toString(member));

            break;
        }
    }
}
