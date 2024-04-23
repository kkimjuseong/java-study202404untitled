package day11.api.lang;

import java.util.Objects;

class Pen extends Object{
    /*
        const redPen {
            serial: 100,
            color: 'red',
            price: 500,
            company{
                companyName: 'monami',
                address: 'seoul',
            },
         }
     */
    long serial;        // 일련번호
    String color;       // 팬의 색상
    int price;          // 팬의 가격
    Company company;    // 제조 회사

    public Pen(long serial, String color, int price, Company company) {
        this.serial = serial;
        this.color = color;
        this.price = price;
        this.company = company;
    }

    // 펜의 시리얼 번호가 같으면 같은 펜으로 취급하게 한다.
    // equals 를 오버라이딩 할 때는 반드시 해시코드도 같이 오버라이딩 해 두 객체가 같을 경우 주소값도 같게 만든다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}




class Company extends Object{
    String companyName;     // 회사명
    String address;         // 회사 주소

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}



public class ObjectSample extends Object{

    public static void main(String[] args) {

        Company company = new Company("모나미", "서울");
        System.out.println("company = " + company.toString());


        Pen yellowPen = new Pen(100L, "노랑", 1000, new Company("모나미", "어디지?"));


        String cName = yellowPen.company.toString();
        System.out.println("cName = " + cName);

        Pen bluePen = new Pen(200L, "파랑", 1200, new Company("제트스트림", "도쿄"));

        System.out.println("==============================");

        System.out.println(yellowPen == bluePen);
        System.out.println(Integer.toHexString(yellowPen.hashCode()));
        System.out.println(Integer.toHexString(bluePen.hashCode()));

        System.out.println("==============================");

        // 만약에 펜의 시리얼 넘버가 같다면 같은 펜으로 취급하겠다.
        Pen redPen1 = new Pen(150L, "red", 1000, company);
        Pen redPen2 = new Pen(150L, "red", 1500, company);

        System.out.println(redPen1 == redPen2);
        System.out.println(redPen1.equals(redPen2));

        // 두 객체가 같다고 판단함
        System.out.println("redPen1 = " + redPen1.hashCode());
        System.out.println("redPen2 = " + redPen2.hashCode());




    }
}
