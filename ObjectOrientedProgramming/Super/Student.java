package Super;

public class Student extends Person{
    
    // We used super (firstName, lastName) because we extended Person class
    // So instead of this.firstName = firstName;
    // Since it was already initialized in Person class we used super
    double GWA;

    Student(String firstName, String lastName, double GWA) {
        super(firstName, lastName);
        this.GWA = GWA;
    }

    void showGWA() {
        System.out.println(this.firstName + "'s GWA is " + this.GWA);
    }
    
}