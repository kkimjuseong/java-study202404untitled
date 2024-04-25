package day12.stream;

import java.util.Objects;

public class DishDetail {

    private final String dishName;
    private final String dishType;

    public DishDetail(Dish dish) {
        this.dishName = dish.getName();
        this.dishType = dish.getType().getDesc();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishDetail that = (DishDetail) o;
        return Objects.equals(dishName, that.dishName) && Objects.equals(dishType, that.dishType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName, dishType);
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "dishName='" + dishName + '\'' +
                ", dishType='" + dishType + '\'' +
                '}';
    }

    public String getDishName() {

        return dishName;
    }

    public String getDishType() {
        return dishType;
    }
}
