package com.pb.pristinskiy.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
