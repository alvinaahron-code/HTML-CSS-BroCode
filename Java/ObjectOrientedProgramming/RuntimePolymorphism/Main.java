package RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    
    // Runtime Polymorphism = When the method that gets executed is decided
    // at runtime, based on the actual type of the object
    // AKA Dynamic Polymorphism

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean play = true;
        Sport sport;
        int choice;

        while(play){
            System.out.println("\n========== SPORTS ZONE =========");
            System.out.println("1. Basketball");
            System.out.println("2. Swimming");
            System.out.println("3. Volleyball");
            System.out.println("4. Soccer");
            System.out.println("5. Badminton");
            System.out.println("6. Exit");
            System.out.print("\nEnter number choice: ");

            if(!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number!");
                scanner.next(); // Clear the invalid input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                sport = new Basketball();
                sport.play();
                break;
                
                case 2:
                sport = new Swimming();
                sport.play();
                break;

                case 3:
                sport = new Volleyball();
                sport.play();
                break;

                case 4:
                sport = new Soccer();
                sport.play();
                break;

                case 5:
                sport = new Badminton();
                sport.play();
                break;

                case 6:
                System.out.println("Thank you for playing! Exiting...");
                play = false;
                break;
                
                default:
                System.out.println("Invalid input. Try again!");
                continue;
            }

             if(choice >= 1 && choice <= 5) {
                boolean validResponse = false;
                
                while(!validResponse) {
                    System.out.print("\nDo you want to choose again? (Y/N): ");
                    String response = scanner.nextLine().trim().toLowerCase();
                    
                    if(response.equals("y") || response.equals("yes")) {
                        validResponse = true;
                        // Continue loop (play remains true)
                    }
                    else if(response.equals("n") || response.equals("no")) {
                        System.out.println("Thank you for playing! Exiting...");
                        play = false;
                        validResponse = true;
                    }
                    else {
                        System.out.println("Invalid response. Please enter Y/N or Yes/No.");
                    }
                }
            }
        }
        scanner.close();
    }
}