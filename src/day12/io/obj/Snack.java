package day12.io.obj;

import java.io.Serializable;
import java.util.Objects;

// Serializable : 객체를 입출력 해주기 위해
public class Snack implements Serializable {

    public enum Taste{
        GOOD, BAD, SOSO
    }

    private String snackName;
    private int year;
    private int price;
    private Taste taste;

    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public Taste getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }
}
