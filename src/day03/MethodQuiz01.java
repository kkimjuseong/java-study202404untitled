package day03;

import java.util.Arrays;

public class MethodQuiz01 {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String food) {
        String[] newFoods = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            newFoods[i] = foods[i];
        }
        newFoods[foods.length] = food;
        foods = newFoods;
    }

    static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                return i;
            }
        }
        return -1; // 해당 음식을 찾지 못한 경우 -1 반환
    }

    static void remove(String food) {
        int index = indexOf(food);
        if (index != -1) {
            String[] newFoods  = new String[foods.length - 1];
            int newIndex = 0;
            for (int i = 0; i < foods.length; i++) {
                if (i != index) {
                    newFoods[newIndex++] = foods[i];
                }
            }
            foods = newFoods;
        }
    }

    static boolean include(String food) {
        int index = indexOf(food);
        return index != -1;
    }

    static void insert(int index, String food) {
        if (index >= 0 && index <= foods.length) {
            String[] newFoods = new String[foods.length + 1];
            for (int i = 0, j = 0; i < newFoods.length; i++) {
                if (i == index) {
                    newFoods[i] = food;
                } else {
                    newFoods[i] = foods[j++];
                }
            }
            foods = newFoods;
        }
    }

    static void modify(int index, String newFood) {
        if (index >= 0 && index < foods.length) {
            foods[index] = newFood;
        }
    }
    public static void main(String[] args) {


        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("치킨");
        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();

        modify(2, "닭갈비");
        printFoods();


    }
}