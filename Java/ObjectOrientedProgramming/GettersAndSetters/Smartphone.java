package GettersAndSetters;

public class Smartphone {
    // When creating getters and setters make the attributes private
    private String model;
    private String color;
    private int year;

    Smartphone(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    int getYear() {
        return this.year;
    }

    // You can also add additional logic
    // String getYear() {
    // return "$" + this.year;
    //}

    void setColor(String color) {
        this.color = color;
    }

    void setYear(int year) {
        // Add validation for additional logic or for fun ;)
        if (year < 2023) {
            System.out.println("Year model is outdated. Recommended year is 2024 and above");
        } else {
            this.year = year;
        }
    }
    
}