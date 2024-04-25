package day12.stream.quiz2;

import day12.stream.quiz1.Transaction;

import java.awt.print.Book;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );

        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.
        List<Booking> bookingsIn2022 = bookings.stream()
                .filter(booking -> booking.getYear() == 2022)
                .sorted(Comparator.comparing(Booking::getPrice))
                .collect(Collectors.toList());

        System.out.println("가격 오름차 정렬 = \n" + bookingsIn2022);

        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.
        List<String> Countries = bookings.stream()
                .map(b -> b.getDestination().getCountry())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("여행지가 있는 모든 나라 = " + Countries);

        // 연습 3: Paris 에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.
        List<Booking> parisTraveler = bookings.stream()
                .filter(b -> b.getDestination().getCity().equals("Paris"))
                .sorted(Comparator.comparing(b -> b.getTraveler().getName()))
                .collect(Collectors.toList());

        System.out.println("Paris 에 예약 = " + parisTraveler);

        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환.
        List<String> emilaList = bookings.stream()
                .map(Booking::getTraveler)
                .map(Traveler::getEmail)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("emilaList = " + emilaList);

        // 연습 5: Italy 로의 여행이 한 건이라도 있는지 여부 확인.
        boolean hasItalyTravel = bookings.stream()
                .anyMatch(b -> b.getDestination().getCountry().equals("Italy"));

        System.out.println("hasItalyTravel = " + hasItalyTravel);

        // 연습 6: France 로의 모든 여행의 총 가격을 출력.
        int totalPriceForFrance  = bookings.stream()
                .filter(b -> b.getDestination().getCountry().equals("France"))
                .mapToInt(b -> (int) b.getPrice())
                .sum();

        System.out.println("France 여행 총 가격 = " + totalPriceForFrance);

        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?
        int maxPrice = bookings.stream()
                .mapToInt(b -> (int) b.getPrice())
                .max()
                .orElse(0);

        System.out.println("최고 가격 = " + maxPrice);

        // 연습 8: 가장 저렴한 여행의 정보 탐색.
        int minPrice = bookings.stream()
                .mapToInt(b -> (int) b.getPrice())
                .min()
                .orElse(0);

        System.out.println("minPrice = " + minPrice);

        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.
        System.out.println("가격이 2000원 이상인 모든 여행 예약 정보");
        bookings.stream()
                .filter(b -> b.getPrice() > 2000)
                .forEach(System.out::println);

        // 연습 10: 모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격을 계산하시오.
        double averageAboveMin = bookings.stream()
                .filter(b -> b.getPrice() > minPrice)
                .mapToInt(b -> (int) b.getPrice())
                .average()
                .orElse(0);

        System.out.println("가장 작은 거래액보다 큰 거래액을 가진 거래의 평균 = " + averageAboveMin);

        // 연습 11: 모든 여행자의 여행 예약을 여행지별로 그룹화하여 출력하시오.
        System.out.println("Bookings grouped by destination: ");
        bookings.stream()
                .collect(Collectors.groupingBy(b -> b.getTraveler().getName()))
                .forEach((destination, destinationBookings) -> {
                    System.out.println("Destination: " + destination);
                    destinationBookings.forEach(System.out::println);
                });

        // 연습 12: 모든 예약 중 최고 가격과 최저 가격의 차이를 계산하시오.
        int priceRange = bookings.stream()
                .mapToInt(b -> (int) b.getPrice())
                .max()
                .orElse(0) - bookings.stream()
                .mapToInt(b -> (int) b.getPrice())
                .min()
                .orElse(0);
        System.out.println("Price range: " + priceRange);
    }

}
