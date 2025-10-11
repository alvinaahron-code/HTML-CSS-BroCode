package Human;

public class Human {

    // We will declare these but not assign a value
    String name;
    int age;
    double weight;

    // Use the same name as the class to create a constructor
    Human (String name, int age, double weight) {
        // Imagine this.name is the same as human.name, we are assigning the values (name, age, weight) 
        // to the human object
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // In order to access an objects attributes (name, age, weight) from within its own class
    // We use the "this" keyword
    
    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink() {
        System.out.println(this.name + " is drinking juice. *burp*");
    }
    
}
