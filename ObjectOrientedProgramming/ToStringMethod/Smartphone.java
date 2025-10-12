package ToStringMethod;

public class Smartphone {

    String model;
    String color;
    int year;

    Smartphone(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.color + " " + this.model + " " + this.year;
    }
}