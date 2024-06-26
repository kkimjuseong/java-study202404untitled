package day12.lambda;

import java.util.ArrayList;
import java.util.List;


// 사과를 여러가지 방법으로 필터링 하는 클래스
public class FilterApple {

    /**
     * @solution = try1: 사과바구니 안에서 색상이 녹색인 사과들만 필터링하고 싶어
     * @param basket : 다양한 사과가 들어있는 리스트
     * @return  - basket 에서 녹색사과만 필터링한 리스트
     * @problem - 만약에 다른 색깔에 사과를 필터링해야 한다면 이 메서드는 한계가 있다.
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 녹색 사과만 담을 바구니 생성
        List<Apple> greenApples = new ArrayList<Apple>();

        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor().equals(Color.GREEN)) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @solution     - try2 : 색상을 파라미터화 하여 원하는 컬러의 사과를 필터링 한다.
     * @problem      - 필터 기준이 색상이 아니라 무게기준이면?
     * @param basket -
     * @param color  - 원하는 색 필터링
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        // 녹색 사과만 담을 바구니 생성
        List<Apple> filteredApples = new ArrayList<Apple>();

        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor().equals(color)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }


    // 필터링 조건을 파라미터화 할 수는 없을까?

    /**
     * @solution - try3 : 동작(메서드)을 추상화시켜 파라미터화 한다.
     * @problem - 필터링 대상이 사과가 아니라 오렌지면? 학생이라면?
     * @param basket
     * @return
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p) {
        List<Apple> filteredApples = new ArrayList<>();

        // 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (p.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @soultion - try4 : 여러 객체들을 필터링
     * @param basket
     * @param
     * @return
     */
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> p) {

        List<T> filteredList = new ArrayList<>();

        // 반복문과 조건문을 통해 필터링
        for (T t : basket) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

}
