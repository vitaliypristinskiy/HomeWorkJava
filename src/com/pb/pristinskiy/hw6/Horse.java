package com.pb.pristinskiy.hw6;

public class Horse extends Animal {
    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Конь ест.");
    }

    @Override
    public String makeNoise() {
        return "Ржание";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food: '" + getFood() + '\'' +
                ", location: '" + getLocation() + '\'' +
                ", weight = " + weight +
                '}';
    }

}
