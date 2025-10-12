package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        
        // Overloaded Constructors = Allows class to have multiple constructors with different parameters
        // Enables objects to be initialized in various ways

        User user1 = new User("Spongebob");
        User user2 = new User("Plankton", "Plankton@gmail.com");
        User user3 = new User("Mr.Crabs", "Crabs@gmail.com", 30);
        User user4 = new User();

        System.out.println("\n===============================");
        System.out.println(user1.username);

        System.out.println(user2.username + " | " + user2.email);
        System.out.println(user3.username + " | " + user3.email + " | " + user3.age);
        System.out.println(user4.username + " | " + user4.email + " | " + user4.age);

        System.out.println();
        user1.play();
        
    }
    
}
