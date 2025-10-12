package Super;

public class Main {
    //                                     Child         Parent
    // super = Refers to the Parent class (subclass <- superclass)
    // Used in constructors and method overriding
    // Calls the parent constructor to initialize attributes

    public static void main(String[] args) {
    
        Person person = new Person("Michael", "JORDAN");
        Student student = new Student("Lebron", "JAMES", 1.20);
        Employee employee = new Employee("Kobe", "BRYANT", 24000.00);

        System.out.println("\n===== ATHLETES =====");
        System.out.print("Name: "); 
        person.showName();

        System.out.print("\nName: ");
        student.showName();
        System.out.print("GWA: ");
        student.showGWA();

        System.out.print("\nName: ");
        employee.showName();
        System.out.print("Salary: ");
        employee.showSalary();
    }
}