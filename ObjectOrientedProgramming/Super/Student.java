package Super;

public class Student extends Person{
    
    double GWA;

    Student(String firstName, String lastName, double GWA) {
        super(firstName, lastName);
        this.GWA = GWA;
    }

    void showGWA() {
        System.out.println(this.firstName + "'s GWA is " + this.GWA);
    }
    
}
