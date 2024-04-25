package day12.stream.quiz1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        System.out.println("21년에 발생한 모든거래");
        List<Transaction> transactionsIn2021 = transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

        transactionsIn2021.forEach(System.out::println);
        System.out.println("=============================================");
        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        System.out.println("거래자가 근무하는 모든 도시이름");
        List<String> uniqueCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        uniqueCities.forEach(System.out::println);
        System.out.println("=============================================");

        // 연습 3: Cambridge 에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("Cambridge 에 근무하는 모든 거래자 이름순으로 오름차정렬");
        List<Trader> tradersInCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        tradersInCambridge.forEach(System.out::println);
        System.out.println("=============================================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        System.out.println("모든 거래자의 이름을 리스트 알파벳 오름차정렬");
        List<String> traderNames = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        traderNames.forEach(System.out::println);
        System.out.println("=============================================");

        // 연습 5: Milan 에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        System.out.println("Milan 에 거주하는 거래자 존재 = " + flag1);
        System.out.println("=============================================");

        // 연습 6: Cambridge 에 사는 거래자의 모든 거래액의 총합 출력.
        int totalValueInCambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();

        System.out.println("Cambridge 에 사는 거래자의 모든 거래액의 총합 = " + totalValueInCambridge);
        System.out.println("=============================================");

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxTransactionValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);     // 만약 결과가 null 일 경우 어떻게 할거냐

        System.out.println("최고거래액 = " + maxTransactionValue);
        System.out.println("=============================================");

        /*
            자바의 단점 : null 체크 문법이 없음.
         */
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        int minTransactionValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElse(0);

        System.out.println("가장 작은 거래액 = " + minTransactionValue);
        System.out.println("=============================================");

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        transactions.stream()
                .filter(t -> t.getValue() >= 500)
                .forEach(System.out::println);

        System.out.println("=============================================");


        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        double averageAboveMin = transactions.stream()
                .filter(t -> t.getValue() > minTransactionValue)
                .mapToInt(Transaction::getValue)
                .average()
                .orElse(0);

        System.out.println("가장 작은 거래액보다 큰 거래액을 가진 거래의 평균 = " + averageAboveMin);
        System.out.println("=============================================");


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래 정보들을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}

                const data = {
                    2021: [
                        {
                            trader: {
                                city: '',
                                name: ''
                            },
                            year: 2021,
                            value: 300
                        },
                        {}
                    ],
                    2022: []
                }
         */

//        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();
//
//        List<Transaction> trs2021 = transactions.stream()
//                .filter(trs -> trs.getYear() == 2021)
//                .collect(Collectors.toList());
//
//        List<Transaction> trs2022 = transactions.stream()
//                .filter(trs -> trs.getYear() == 2022)
//                .collect(Collectors.toList());
//
//        groupByYearMap.put(2021, trs2021);
//        groupByYearMap.put(2022, trs2022);
//
//
//        System.out.println("=====================");
//        for (Integer year : groupByYearMap.keySet()) {
//            System.out.println("year = " + year);
//            for (Transaction transaction : groupByYearMap.get(year)) {
//                System.out.println(transaction);
//            }
//        }

        Map<Integer, List<Transaction>> cambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(t -> t.getYear()));

        cambridge.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });


        System.out.println("=============================================");
        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        int difference = maxTransactionValue - minTransactionValue;

        System.out.println("가장 큰 거래액과 가장 작은 거래액의 차이 = " + difference);

    }

}
