package ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        
        /*  FIRST WAY
        Motor motor1 = new Motor("Yamaha", "Blue");
        Motor motor2 = new Motor("Kawasaki", "Red");
        Motor motor3 = new Motor("BMW", "Green");

        Motor[] motors = {motor1, motor2, motor3};
        */

        // SECOND WAY
        Motor[] motors = {new Motor("Yamaha", "Blue"), 
            new Motor("Kawasaki", "Red"), new Motor("BMW", "Green")};

            System.out.println("\nFor-Loop");
            for (int i = 0; i < motors.length; i++) {
            motors[i].drive();
        }

        System.out.println("\n----------------------------------------");

        System.out.println("\nEnhanced For-Loop");
        for (Motor motor : motors) {
            motor.drive();
        }
    }
}
